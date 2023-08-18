public class Main{	public static void main(String[] args) throws IOException {
	    input = new DataReader();
		PrintWriter out = new PrintWriter(System.out);
		int N = nextInt(), M = nextInt(), P = 1<<M;
		String x = nextStr();
		int c1 = x.charAt(0) - 'a';
		int[][] pair_count = new int[M][M];
		for (int i=1; i<N; i++) {
			int c2 = x.charAt(i) - 'a';
			if (c1 < c2) 
				pair_count[c1][c2]++;
			else if (c1 > c2)
				pair_count[c2][c1]++;
			c1 = c2;
		}
		int[] group_count = new int[P];
		for (int mask = 1; mask <P; mask++) {
			int j;
			for (j=0; j<M; j++) {
				if ((mask & BM[j]) > 0)  break;
			}
			int nmask = mask ^ BM[j];
			int val = group_count[nmask];
			for (int i=0; i<j; i++) {
				if ((mask & BM[i]) > 0)  val -= pair_count[i][j];
				else                   val += pair_count[i][j];
			}
			for (int i=j+1; i<M; i++) {
				if ((mask & BM[i]) > 0)  val -= pair_count[j][i];
				else                   val += pair_count[j][i];
			}
			group_count[mask] = val;
		}
		// dp[k][mask] = Accumulated cost of first K positions filled, mask position 1 letters are used
		// dp[0][0] = 0;
		int[][] dp = new int[M+1][P];	   // 
		for (int mask=1; mask<P; mask++) {  // each bit mask
			dp[0][mask] = 0;
			int k = Integer.bitCount(mask);  // computing first k position filled.
			int val = LARGE_INT;
			for (int j=0; j<M; j++) {
				if ((mask & BM[j]) > 0) {
					int nmask = mask ^ BM[j];
					val = Math.min(val, dp[k-1][nmask] + group_count[nmask]);
				}				
			}
			dp[k][mask] = val;
		}
		//out.println(Arrays.deepToString(dp));
		out.println(dp[M][P-1]);
		out.flush();
		out.close();
	}
}