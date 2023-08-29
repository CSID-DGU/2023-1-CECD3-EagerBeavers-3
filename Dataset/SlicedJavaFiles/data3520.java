public class Main{	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		long b = chars.length();
		int n = sc.nextInt();
		mod = sc.nextLong();
		if(n > 110) {
			char[] s = vals[n-111].toCharArray();
			long res = 0;
			for(char c: s) {
				res *= b;
				res += chars.indexOf(c);
				res %= mod;
			}
			System.out.println(res);
		}
		else {
			c = new long[N+1][N+1];
			c[0][0] = 1;
			for(int i = 0; i < n; i++){
				c[i][0] = 1;
				for(int j = 1; j <= i; j++){
					c[i][j] = (c[i-1][j] + c[i-1][j-1]) % mod;
				}
			}
			dpcl = new long[N+1][N+1];
			dpop = new long[N+1][N+1];
			for(int i = 0; i <= N; i++){
				for(int j = 0; j <= N; j++){
					dpcl[i][j] = -1;
					dpop[i][j] = -1;
				}
			}
			long res = 0;
			for(int i = 0; i < n; i++){
				for(int j = 0; j <= n-1; j++){
					for(int a = 0; a <= j; a++) {
						long leftv = dpop(i, a);
						long rightv = dpop(n-i-1, j-a);
						long curr = leftv * rightv % mod;
						long fac = c[j][a];
						long v = curr * fac % mod;
						res = (res + v) % mod;
					}
				}
			}
			System.out.println(res);
		}
	}
}