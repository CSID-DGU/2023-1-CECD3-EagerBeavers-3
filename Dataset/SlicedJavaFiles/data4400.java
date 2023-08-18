public class Main{	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		PrintWriter out = new PrintWriter(System.out);
		r = Integer.parseInt(st.nextToken());
		
		c = Integer.parseInt(st.nextToken());
		int[][] arr = new int[r][c];
		memo = new int[r][r][1 << r];
		mn1 = new int[r][r];
		mn2 = new int[r][r];
		for(int i=0;i<r;i++) {
			st=new StringTokenizer(br.readLine());
			for(int j=0;j<c;j++) {
				arr[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		for (int i = 0; i < r; i++) {
			Arrays.fill(mn1[i], (int)1e9);
			Arrays.fill(mn2[i], (int)1e9);
		}
		
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < r; j++) {
				Arrays.fill(memo[i][j], -1);
			}
		}
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < r; j++) {
				for (int k = 0; k < c; k++) {
					
					mn1[i][j] = Math.min(mn1[i][j], Math.abs(arr[i][k] - arr[j][k]));
					
				}
			}
		}
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < r; j++) {
				for (int k = 0; k < c-1; k++) {
					
					mn2[i][j] = Math.min(mn2[i][j], Math.abs(arr[j][k] - arr[i][k + 1]));
					
				}
			}
		}
		
		int ans = 0;
		for (int i = 0; i < r; i++) {
			ans=Math.max(ans, dp(1<<i,i,i));
		}
		if(r==1)
			ans=mn2[0][0];
		out.println(ans);
		out.flush();
	}
}