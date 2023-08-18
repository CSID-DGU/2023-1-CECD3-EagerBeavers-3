public class Main{	public static void main(String[] omkar) throws Exception{
		// TODO Auto-generated method stub
 		sc = new MyScanner();
 		out = new PrintWriter(System.out);
 		
	 	int n = sc.nextInt();
	 	int m = sc.nextInt();
	 	int[][]cnt = new int[m][m];
	 	String s = sc.next();
	 	for(int j =0;j<n-1;j++){
	 		if (s.charAt(j) != s.charAt(j+1)){
	 		cnt[s.charAt(j)-'a'][s.charAt(j+1)-'a']++;
	 		cnt[s.charAt(j+1)-'a'][s.charAt(j)-'a']++;
	 		}
	 	}
	 	int[] st = new int[m+1];
	 	for(int j = 0;j<=m;j++){
	 		st[j] = (1<<j);
	 	}
	 	int[][] arr = new int[m][1<<m];
	 	for(int j = 0;j<m;j++){
	 		for(int k = 1;k<(1<<m);k++){
	 			int z = Integer.lowestOneBit(k);
	 			int count = 0;
	 			while(z!=0 && z%2==0){
	 				z/=2;
	 				count++;
	 			}
	 			arr[j][k] = arr[j][k^(Integer.lowestOneBit(k))] + cnt[j][count];
	 		}
	 	}
	 	int[] dp = new int[1<<m];
	 	Arrays.fill(dp,  Integer.MAX_VALUE);
	 	dp[0] = 0;
	 	for(int j = 1;j<st[m];j++){
	 		
	 		for(int k = 0;k<m;k++){
	 			int y = st[k];
	 			if ((y&j) != 0){
	 				int sum = 2*arr[k][j] - arr[k][(1<<m)-1];
//	 				for(int t = 0;t<m;t++){
//	 					if (t!= k){
//		 					if ((st[t]&j) != 0)
//		 						sum+=cnt[t][k];
//		 					else
//		 						sum-=cnt[t][k];
//	 					}
//	 				}
	 				dp[j] = Math.min(dp[j],  dp[y^j]+sum*Integer.bitCount(j));
	 			}
	 		}
	 	}
	 	out.println(dp[(1<<m)-1]);
 		out.close();	
 	}
}