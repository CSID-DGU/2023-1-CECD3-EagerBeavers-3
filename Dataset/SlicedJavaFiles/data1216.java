public class Main{	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(rd.readLine());
		n = Long.parseLong(st.nextToken());
		m = Long.parseLong(st.nextToken());
		k = Long.parseLong(st.nextToken());
		long s = n - m;
		s = Math.min(s, m / (k - 1));
		s = Math.min(s, n / k);
		long score = 0;
		score = (s * (k - 1))%P;
		long n1 = n - k * s, m1 = m - (k - 1) * s;
		sc = 0;
	//	rec(n, m);
	//	System.out.println(sc);
		if (m1 == n1) {
			score = (score + full(m1)) % P;
			System.out.println(score);
			return;
		}
			score = (score + m1) % P;
			System.out.println(score);
	}
}