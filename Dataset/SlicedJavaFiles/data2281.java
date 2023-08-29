public class Main{	public static void main(String[] args) throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		int n = nextInt();
		int[]dp1 = new int[n+1];
		int[]dp2 = new int[n+1];
		dp1[1] = 1;
		int mod = (int) (1e9+7);
		char[]instruction = new char[n+1];
		instruction[0] = 's';
		int[]sum = new int[n+1];
		for (int i = 1; i <= n; i++) {
			instruction[i] = next().charAt(0);
			for (int j = 1; j <= i; j++) {
				sum[j] = sum[j-1] + dp1[j];
				if (sum[j] >= mod)
					sum[j] -= mod;
			}
			for (int j = 1; j <= i; j++) {
				if (instruction[i-1]=='f')
					dp2[j] = dp1[j-1];
				else {
					dp2[j] = sum[i] - sum[j-1];
					if (dp2[j] < 0)
						dp2[j] += mod;
				}
			}
			for (int j = 1; j <= i; j++) {
				dp1[j] = dp2[j];
			}
		}
		int ans = 0;
		for (int i = 1; i <= n; i++) {
			ans += dp1[i];
			if (ans >= mod)
				ans -= mod;
		}
		System.out.println(ans);
		pw.close();
	}
}