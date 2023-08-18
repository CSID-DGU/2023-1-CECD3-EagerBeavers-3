public class Main{	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int t = Integer.parseInt(st.nextToken());
		int[] aa = new int[n];
		int[] bb = new int[n];
		int[] cc = new int[n];
		int na = 0, nb = 0, nc = 0;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int g = Integer.parseInt(st.nextToken());
			if (g == 1)
				aa[na++] = a;
			else if (g == 2)
				bb[nb++] = a;
			else
				cc[nc++] = a;
		}
		int[][][] dp = init(n, na, nb, nc);
		int[][][] dab = solve2(aa, bb, t, na, nb);
		int[][] dc = solve1(cc, t, nc);
		int ans = 0;
		for (int tab = 0; tab <= t; tab++) {
			int tc = t - tab;
			for (int ma = 0; ma <= na; ma++)
				for (int mb = 0; mb <= nb; mb++) {
					int xab = dab[tab][ma][mb];
					if (xab == 0)
						continue;
					for (int mc = 0; mc <= nc; mc++) {
						int xc = dc[tc][mc];
						if (xc == 0)
							continue;
						ans = (int) ((ans + (long) xab * xc * dp[ma][mb][mc]) % MD);
					}
				}
		}
		System.out.println(ans);
	}
}