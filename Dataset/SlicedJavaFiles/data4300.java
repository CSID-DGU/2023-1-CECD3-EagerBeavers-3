public class Main{	public static void main(String[] args) throws Exception {
		int n = nextInt(), k = nextInt(), A = nextInt(), r = n + k - 1;
		int[][] s = new int[n][];
		for (int i = 0; i < n; i++) {
			s[i] = new int[] { nextInt(), nextInt() };
		}
		double max = 0;
		int[] prb = new int[n];
		for (int u = (1 << r); u >= 0; u--) {
			// ¬á¬â¬à¬Ó¬Ö¬â¬Ú¬Þ ¬ß¬Ñ n-1 ¬Ö¬Õ¬Ú¬ß¬Ú¬é¬Ö¬Ü
			int ones = 0;
			for (int i = 0; i < r; i++) {
				if ((u & (1 << i)) != 0) {
					ones++;
				}
			}
			if (ones != n - 1) {
				continue;
			}
			// ¬á¬â¬à¬Ó¬Ö¬â¬Ú¬Ý¬Ú. ¬â¬Ñ¬ã¬ã¬ä¬Ñ¬Ó¬Ý¬ñ¬Ö¬Þ ¬Þ¬Ñ¬ã¬ã¬Ú¬Ó
			ones = 0;
			int p = 0;
			for (int i = 0; i < r; i++) {
				if ((u & (1 << i)) == 0) {
					ones++;
				} else {
					prb[p] = ones * 10;
					p++;
					ones = 0;
				}
			}
			prb[p] = ones * 10;
			p++;
			ones = 0;
			double sum = 0;
			for (int i = 0; i < n; i++) {
				if (prb[i] > 100 - s[i][1])
					prb[i] = 100 - s[i][1];
				s[i][1] = prb[i] + s[i][1];
			}
			for (int i = (1 << n) - 1; i >= 0; i--) {
				double prob = 1;
				int lvl = 0;
				int kill = 0;
				for (int j = 0; j < n; j++) {
					if ((i & (1 << j)) != 0) {
						prob *= s[j][1] / 100.0;
						kill--;
					} else {
						lvl += s[j][0];
						prob *= (1 - s[j][1] / 100.0);
						kill++;
					}
				}
				if (kill >= 0) {
					sum += prob * ((double) A / (A + lvl));
				} else {
					sum += prob;
				}
			}
			for (int i = 0; i < n; i++) {
				s[i][1] = -prb[i] + s[i][1];
			}
			max = Math.max(max, sum);
		}
		out.println(max);
		out.flush();
	}
}