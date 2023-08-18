public class Main{	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int m = in.nextInt();
		
		String s = in.next();
		
		int[][] count = new int[m][m];
		int[] dp = new int[1 << m];
		
		Arrays.fill(dp, Integer.MAX_VALUE);
		dp[0] = 0;
		
		for(int i = 1; i < n; i++) {
			int a = s.charAt(i)-'a';
			int b = s.charAt(i-1)-'a';
			count[a][b]++;
			count[b][a]++;
		}
		
		for(int i = 1; i < (1 << m); i++) {
			
			int pos = set_bits(i);
			
			for(int j = 0; (i >> j) != 0; j++) {
				
				if(((i >> j) & 1) == 0) continue;
				
				int sum = 0;
				
				for(int mask = i, y = 0; y < m; mask >>= 1, y++) {
					if(y == j) continue;
					if((mask & 1) == 1) sum += count[j][y];
					else sum -= count[j][y];
				}
				
				int calc = dp[i-(1<<j)] + pos*sum;
				
				dp[i] = Math.min(dp[i], calc);
			}
			
		}
		
		System.out.println(dp[(1 << m)-1]);
		
	}
}