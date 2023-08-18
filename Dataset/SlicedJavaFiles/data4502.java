public class Main{ 	public static void main(String[] args){
		FastScanner scanner = new FastScanner();
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		String s = scanner.next();
		int[][] cnt = new int[20][20];
		for(int i = 0; i < n-1; i++){
			cnt[s.charAt(i)-'a'][s.charAt(i+1)-'a']++;
			cnt[s.charAt(i+1)-'a'][s.charAt(i)-'a']++;
		}
		//dp[i]:= Ùþí®Öªi(ª³ªÎñéªËÔÒìéÙþí®ªÏùßªÞªìªÊª¤)ªòíÂªÃª¿ãÁªÎ«³«¹«ÈªÎõÌá³ö·
		int[] dp = new int[(1<<m)];
		for(int i = 0; i < (1<<m); i++){
			dp[i] = INF;
		}
		dp[0] = 0;
		for(int i = 0; i < (1<<m); i++){
			int cost = 0;
			for(int j = 0; j < m; j++){
				if((i>>j & 1) == 0){
					for(int k = 0; k < m; k++){
						if((~i>>k & 1) == 0){
							cost += cnt[j][k];
						}
					}
				}
			}
			for(int j = 0; j < m; j++){
				dp[i|1<<j] = Math.min(dp[i|1<<j],dp[i]+cost);
			}
		}
		System.out.println(dp[(1<<m)-1]);
	}
}