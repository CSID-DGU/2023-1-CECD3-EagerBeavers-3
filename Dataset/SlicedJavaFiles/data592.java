public class Main{	public static void main(String[] args) throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		int n = nextInt();
		int d = nextInt();
		int[]x = new int[n];
		for (int i = 0; i < n; i++) {
			x[i] = nextInt();
		}
		int ans = 2;
		for (int i = 1; i < n; i++) {
			if (x[i]-x[i-1]==2*d)
				ans++;
			else if (x[i]-x[i-1] > 2*d)
				ans += 2;
		}
		System.out.println(ans);
		pw.close();
	}
}