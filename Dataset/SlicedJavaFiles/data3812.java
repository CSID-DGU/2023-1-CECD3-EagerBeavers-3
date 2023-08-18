public class Main{	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		
		// int t = Integer.parseInt(br.readLine());
//		while (t-- > 0) {
		String[] s2 = br.readLine().split(" ");
		int n = Integer.parseInt(s2[0]);
		int m = Integer.parseInt(s2[1]);
		int k = Integer.parseInt(s2[2]);
		dp=new long[n][m][k+1];
		int[][] hori = new int[n][m - 1];
		int[][] verti = new int[n - 1][m];
		for (int i = 0; i < n; i++) {
			String str = (br.readLine());
			String[] s1 = str.split(" ");
			for (int j = 0; j < m - 1; j++) {
				hori[i][j] = Integer.parseInt(s1[j]);
			}
		}
		for (int i = 0; i < n - 1; i++) {
			String str = (br.readLine());
			String[] s1 = str.split(" ");
			for (int j = 0; j < m; j++) {
				verti[i][j] = Integer.parseInt(s1[j]);
			}
		}
		long[][]ans=new long[n][m];
		if(k%2!=0) {
			for(int i=0;i<n;i++) {
				for(int j=0;j<m;j++) {
					ans[i][j]=-1;
				}
			}
		}else {
			for(int i=0;i<n;i++) {
				for(int j=0;j<m;j++) {
					ans[i][j]=findAns(i,j,k,hori,verti,n,m,Integer.MAX_VALUE);
				}
			}
		}
		for(int i=0;i<n;i++) {
			StringBuilder str=new StringBuilder();
			for(int j=0;j<m;j++) {
				str.append(ans[i][j]+" ");
			}pw.println(str.toString());
		}
		// }

		pw.close();
	}
}