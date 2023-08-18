public class Main{	public static void main (String [] arg) throws Throwable {
		int t = nextInt();
		C : for (int ii = 0; ii<t; ++ii) {
			int n = nextInt();
			int m = nextInt();
			Pair [] P = new Pair [n*m];
			int [][] g = new int [n][m];
			for (int i = 0; i<n; ++i) { 
				for (int j = 0; j<m; ++j) {
					g[i][j] = nextInt();
					P[j + m*i] = new Pair (i, j, g[i][j]);
				}
			}
			for (int i = 0; i<P.length; ++i) if (P[i] == null) continue C;
			Arrays.sort(P);
			HashSet<Integer> rotcols =new HashSet<Integer>();
			for (int i = 0; i<n; ++i) {
				//System.err.println("Adding " + P[i].j + " , " + P[i].L);
				rotcols.add(P[i].j);
			}
			
			if (n <= 3 || rotcols.size() >= 3) {
				//System.err.println("EASY");
				int sum = 0;
				for (int i = 0; i<n && i < P.length; ++i) sum += P[i].L;
				System.out.println(sum);
			} else {
				// n == 4
				if (P.length > 4) rotcols.add(P[4].j);
				//Integer [] rr = rotcols.toArray(new Integer[0]);
				int [] rot = new int [rotcols.size()];
				int maxmax = 0;
				A : while (true) {
					for (int i = 0; i<rot.length; ++i) {
						rot[i]++;
						if (rot[i] == n) {
							rot[i] = 0;
							if (i == rot.length-1) break A;
						} else {
							break;
						}
					}
					int [] max = new int [n];
					for (int i = 0; i<n; ++i) {
						int j = 0;
						for (int col : rotcols) {
							max[i] = Math.max(max[i], g[(i+rot[j])%n][col]);
							j++;
						}
					}
					int sum = 0;
					for (int m2 : max) sum+= m2;
					maxmax = Math.max(maxmax, sum);
				}
				System.out.println(maxmax);
			}
		}
	}
}