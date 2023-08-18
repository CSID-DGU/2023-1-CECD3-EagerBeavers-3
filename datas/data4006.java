public class Main{	public static void main(String[] omkar) throws Exception{
		// TODO Auto-generated method stub
 		sc = new MyScanner();
 		out = new PrintWriter(System.out);
 		n = sc.nextInt();
 		t = sc.nextInt();
 		times = new int[n];
 		genre = new int[n];
 		for(int j =0 ;j<n;j++){
 			times[j] = sc.nextInt();
 			genre[j] = sc.nextInt();		
 		}
 		dp = new int[1<<n][4];
 		for(int j = 0;j<1<<n;j++)
 			Arrays.fill(dp[j],  -1);
 		int ans = 0;
 		for(int j=0;j<1<<n;j++){
 			int time = 0;
 			for(int k = 0;k<n;k++){
 				if (((1<<k) & j) != 0){
 					time+=times[k];
 				}
 			}
 			if (time == t){
 				letsgodp(j, 1);
 				letsgodp(j, 2);
 				letsgodp(j, 3);
 				ans+=dp[j][1];
 				ans%=mod;
 				ans+=dp[j][2];
 				ans%=mod;
 				ans+=dp[j][3];
 				ans%=mod;
 			}
 		}
 		out.println(ans);
 		out.close();	
 	}
}