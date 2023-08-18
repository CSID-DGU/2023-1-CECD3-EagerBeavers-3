public class Main{	public static void main(String[] args) {
		MyScanner sc = new MyScanner();
		int t = sc.nextInt();
		for(int w = 0; w < t; w++) {
			int n = sc.nextInt(), m = sc.nextInt();
			TreeSet<X> set = new TreeSet<X>();
			int[][] grid = new int[n][m];
			for(int i = 0; i < n; i++)
				for(int j = 0; j < m; j++) {
					grid[i][j] = sc.nextInt();
					set.add(new X(i, j, grid[i][j]));
				}
			Y[] top4 = new Y[n];
			int sum = 0;
			for(int i = 0; i < n; i++) {
				top4[i] = new Y(set.pollLast());
				sum += top4[i].a;
			}
			Arrays.sort(top4);
			HashSet<String> strs = new HashSet<String>();
			AAA[] sss = new AAA[n];
			boolean[] used = new boolean[n];
			if(n == 4) {
				for(int i = 0; i < 4; i++) {
					int max = -1, jj = -1;
					for(int j = 0; j < 4; j++) {
						if(!used[j] && top4[j].a > max) {
							max = top4[j].a;
							jj = j;
						}
					}
					used[jj] = true;
					sss[i] = new AAA(max, jj);
				}
				for(int i = 0; i < n; i++)
					strs.add(top4[i].i + " " + top4[i].j);
			}
			int ans = sum;
			if(n == 4 && top4[0].j == top4[1].j && top4[2].j == top4[3].j && top4[0].j != top4[2].j) {
				if(two(top4[0], top4[1]) != two(top4[2], top4[3])) {
					ans = 0;
					int oneCol = two(top4[0], top4[1]) ? top4[2].j : top4[0].j;
					for(int i = 0; i < n; i++)
						for(int j = 0; j < m; j++)
							if(!strs.contains(i + " " + j)){
								int no = -1;
								for(int k = 0; k < 4; k++)
									if(j == oneCol && top4[k].j == oneCol && two(top4[k], new Y(new X(i, j, 0))))
										no = k;
								ans = max(ans, sum - sss[no == sss[3].i ? 2 : 3].a + grid[i][j]);
							}
				}
			}
			out.println(ans);
		}
		out.close();
	}
}