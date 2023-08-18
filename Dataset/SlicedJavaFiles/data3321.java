public class Main{	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] eu = new int[m];
		int[] ev = new int[m];
		for (int j = 0; j < m; j++) {
			st = new StringTokenizer(br.readLine());
			eu[j] = Integer.parseInt(st.nextToken());
			ev[j] = Integer.parseInt(st.nextToken());
		}
		A[] aa = new A[n + 1];
		int min = m + n * 3;
		for (int ctr = 1; ctr <= n; ctr++) {
			boolean loop = false;
			boolean[] ci = new boolean[n + 1];
			boolean[] co = new boolean[n + 1];
			for (int i = 0; i <= n; i++)
				aa[i] = new A();
			int m_ = 0;
			for (int j = 0; j < m; j++) {
				int u = eu[j];
				int v = ev[j];
				if (u == ctr && v == ctr)
					loop = true;
				else if (u == ctr && v != ctr)
					ci[v] = true;
				else if (u != ctr && v == ctr)
					co[u] = true;
				else {
					aa[u].list.add(v);
					m_++;
				}
			}
			int cnt = loop ? 0 : 1;
			for (int i = 1; i <= n; i++)
				if (i != ctr) {
					if (!ci[i])
						cnt++;
					if (!co[i])
						cnt++;
				}
			int m2 = matchings(aa, n);
			cnt += (m_ - m2) + (n - 1 - m2);
			if (min > cnt)
				min = cnt;
		}
		System.out.println(min);
	}
}