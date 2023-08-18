public class Main{	public static void main(String[] args) throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		long n = nextLong();
		long s = nextLong();
		long ans = 0;
		if (s+200 <= n)
			ans += n - (s+200) + 1;
		for (long i = s; i < s+200; i++) {
			if (i <= n && i-sumDigits(i) >= s) {
				ans++;
			}
		}
		System.out.println(ans);
		pw.close();
	}
}