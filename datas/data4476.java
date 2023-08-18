public class Main{	public static void main(String[] args) throws IOException{
		FastIO sc = new FastIO(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int num[][] = new int[m][m];
		String str = sc.next();
		for(int i=0; i<str.length()-1; i++) {
			int a = str.charAt(i)-'a';
			int b = str.charAt(i+1)-'a';
			num[a][b]++;
			num[b][a]++;
		}
		int lowbit[] = new int[MXN];
		int dp[] = new int[MXN];
		for(int i=0; i<MXN; i++) {
			dp[i] = Integer.MAX_VALUE;
		}
		dp[0] = 0;
		good = new int[MXN][m];
		for(int msk = 0; msk<(1<<m); msk++) {
			for(int i=0; i<m; i++) {
				int low = Integer.numberOfTrailingZeros(Integer.lowestOneBit(msk));
				if(low==32) low = 0;
				good[msk][i] = good[msk^(1<<low)][i] + num[i][low];
			}
		}
		for(int msk = 0; msk<(1<<m); msk++) {
			int bits = Integer.bitCount(msk)+1;
			for(int i=0; i<m; i++) {
				if((msk&(1<<i))!=0) continue;
				int nxt = msk|(1<<i);
				dp[nxt] = Math.min(dp[nxt], dp[msk] + bits*(good[msk][i]-good[((1<<m)-1)^nxt][i]));
			}
		}
		out.println(dp[(1<<m)-1]);
		out.close();
	}
}