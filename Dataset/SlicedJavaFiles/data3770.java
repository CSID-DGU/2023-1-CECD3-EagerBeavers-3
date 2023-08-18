public class Main{	public static void main(String[] havish) throws Exception{
		// TODO Auto-generated method stub
 		sc = new MyScanner();
 		out = new PrintWriter(System.out);
 		int n = sc.nextInt();
 		int m = sc.nextInt();
 		int k = sc.nextInt();
 		paths = new long[n+1][m+1][4]; //up down left right;
 		powers501 = new long[5];
 		powers501[0] = 1;
 		for(int j = 1;j<5;j++){
 			powers501[j] = 501L*powers501[j-1];
 		}
 		long[][][]dp = new long[n+1][m+1][k/2+2];
 		for(int i = 1;i<=n;i++){
 			for(int j = 1;j<=m-1;j++){
 				int val = sc.nextInt();
 				paths[i][j][3] = val;
 				paths[i][j+1][2] = val;
// 				paths.put(powers501[3]*i + powers501[2]*j + powers501[1]*i + powers501[0]*(j+1), val);
// 				paths.put(powers501[3]*i + powers501[2]*(j+1) + powers501[1]*i + powers501[0]*j, val);
 			}
 		}
 		for(int i = 1;i<=n-1;i++){
 			for(int j = 1;j<=m;j++){
 				int val = sc.nextInt();
// 				paths.put(powers501[3]*(i+1) + powers501[2]*j + powers501[1]*i + powers501[0]*j, val);
// 				paths.put(powers501[3]*i + powers501[2]*j + powers501[1]*(i+1) + powers501[0]*j, val);
 				paths[i][j][1] = val;
 				paths[i+1][j][0] = val;
 				
 			}
 		}
 		for(int j = 1;j<=n;j++){
 			for(int i = 1;i<=m;i++){
 				Arrays.fill(dp[j][i],  Integer.MAX_VALUE);
 				dp[j][i][0] = 0;
 			}
 		}
 		for(int steps = 1;steps<k/2+2;steps++){
 			for(int i = 1;i<=n;i++){
 				for(int j = 1;j<=m;j++){
 					if (i-1 > 0) {
 						dp[i][j][steps] = Math.min(dp[i-1][j][steps-1] + getVal(i, j, i-1, j), dp[i][j][steps]);
 					}
 					if (j-1 > 0) {
 						dp[i][j][steps] = Math.min(dp[i][j-1][steps-1] + getVal(i, j, i, j-1), dp[i][j][steps]);
 					}
 					
 					if (i+1 <= n) {
 						dp[i][j][steps] = Math.min(dp[i+1][j][steps-1] + getVal(i, j, i+1, j), dp[i][j][steps]);
 					}
 					if (j+1 <= m) {
 						dp[i][j][steps] = Math.min(dp[i][j+1][steps-1] + getVal(i, j, i, j+1), dp[i][j][steps]);
 					}
 				}
 			}
 		}
 		if (k%2 == 1){
 			for(int j = 1;j<=n;j++){
 				for(int s = 1;s<=m;s++){
 					out.print(-1 + " ");
 				}
 				out.println();
 			}
 		}
 		else{
 			for(int j = 1;j<=n;j++){
 				for(int s = 1;s<=m;s++){
 					out.print(dp[j][s][k/2]*2L + " ");
 				}
 				out.println();
 			}
 		}
 		
 		
	 		
 		out.close();
 	}
}