public class Main{	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int a = input.nextInt();
		int b = input.nextInt();
		input.close();
		final int mod = 998244353;
		
		int frac = multiply(a, inverse(b, mod), mod);
		int reverse = (mod+1-frac)%mod;
		
		int[] fracpower = new int[n+1];
		int[] reversepower = new int[n+1];
		fracpower[0] = 1;
		reversepower[0] = 1;
		for (int i = 1; i <= n; i++) {
			fracpower[i] = multiply(fracpower[i-1], frac, mod);
			reversepower[i] = multiply(reversepower[i-1], reverse, mod);
		}
		
		int[][] dp1 = new int[n+1][n+1];
		dp1[2][1] = 1;
		for (int i = 3; i <= n; i++) {
			for (int j = 1; j < i; j++) {
				if (j == 1) {
					dp1[i][j] = fracpower[i-1];
				}
				else {
					dp1[i][j] = multiply(dp1[i-1][j-1], fracpower[i-j], mod);
				}
				if (j == i-1) {
					dp1[i][j] += reversepower[i-1];
					dp1[i][j] %= mod;
				}
				else {
					dp1[i][j] += multiply(dp1[i-1][j], reversepower[j], mod);
					dp1[i][j] %= mod;
				}
			}
		}
		
		int[][] dp2 = new int[n+1][n+1];
		dp2[1][1] = 1;
		dp2[2][1] = 1;
		dp2[2][2] = 0;
		for (int i = 3; i <= n; i++) {
			int val = 0;
			for (int j = 1; j < i; j++) {
				dp2[i][j] = multiply(dp2[j][j], dp1[i][j], mod);
				val += dp2[i][j];
				val %= mod;
			}
			dp2[i][i] = (mod+1-val)%mod;
		}
		
		/*for (int i = 2; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(dp2[i][j] + " ");
			}
			System.out.println();
		}*/
		
		int[] EV = new int[n+1];
		EV[1] = 0;
		EV[2] = 1;
		for (int i = 3; i <= n; i++) {
			int val = 0;
			for (int j = 1; j < i; j++) {
				int r = j*(i-j) + (j*(j-1))/2 + EV[i-j] + EV[j];
				r %= mod;
				val += multiply(dp2[i][j], r, mod);
				val %= mod;
			}
			val += multiply((i*(i-1))/2, dp2[i][i], mod);
			val %= mod;
			
			int s = (mod+1-dp2[i][i])%mod;
			EV[i] = multiply(val, inverse(s, mod), mod);
		}
		
		System.out.println(EV[n]);
	}
}