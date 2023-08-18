public class Main{	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long n = Long.parseLong(st.nextToken());
		long s = Long.parseLong(st.nextToken());
		int d = 9 * 18;
		long cnt;
		if (n >= s + d) {
			cnt = n - s - d;
			for (long x = s; x <= s + d; x++)
				if (check(x, s))
					cnt++;
		} else {
			cnt = 0;
			for (long x = s; x <= n; x++)
				if (check(x, s))
					cnt++;
		}
		System.out.println(cnt);
	}
}