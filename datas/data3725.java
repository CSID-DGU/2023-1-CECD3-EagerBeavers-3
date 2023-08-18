public class Main{	public static void main(String[] omkar) throws Exception{
		// TODO Auto-generated method stub
 		sc = new MyScanner();
 		out = new PrintWriter(System.out);
 		int t = sc.nextInt();
 		primes = new ArrayList<>();
 		prime(3165);
 		int[] freq = new int[10000001];
 		while(t--> 0){
 			int n = sc.nextInt();
 			int k = sc.nextInt();
 			int[] arr = readArrayInt(n);
 			for(int j = 0;j<n;j++){
 				arr[j] = factorize(arr[j]);
 			}
 			int[][] left = new int[n][k+1];
 			for(int m = 0;m<=k;m++){
 				int l = 0;
 				int count = 0;
 				for(int i = 0;i<n;i++){
 					if (freq[arr[i]] > 0){
 						count++;
 					}
 					freq[arr[i]]++;
 					while(count > m){
 						freq[arr[l]]--;
 						if (freq[arr[l]] > 0){
 							count--;
 						}
 						l++;
 					}
 					left[i][m] = l;
 				}
 				while(l < n){
 					freq[arr[l]]--;
 					l++;
 				}
 				
 			}
 			long[][] dp = new long[n][k+1];
 			for(int i=0;i<n;i++){
 				Arrays.fill(dp[i],  Integer.MAX_VALUE);
 			}
 			for(int i = 0;i<n;i++){
 				for(int j = 0;j<=k;j++){
 					for(int s = 0;s<=j;s++){
 						if (left[i][s] == 0){
 							dp[i][j] = 1;
 							continue;
 						}
 						dp[i][j] = Math.min(dp[i][j],  dp[left[i][s]-1][j-s]+1);

 					}
 				}
 				
 			}
 			out.println(dp[n-1][k]);
 			
 		}
	 		
 		out.close();
 	}
}