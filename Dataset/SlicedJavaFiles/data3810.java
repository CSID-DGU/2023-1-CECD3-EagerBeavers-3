public class Main{	public static void main(String[] args) {
		FastScanner fs=new FastScanner();
		int h=fs.nextInt(), w=fs.nextInt(), k=fs.nextInt();
		PrintWriter out=new PrintWriter(System.out);
		if (k%2==1) {
			for (int y=0; y<h; y++) {
				for (int x=0; x<w; x++) {
					if (x!=0) out.print(" ");
					out.print(-1);
				}
				out.println();
			}
			out.close();
			return;
		}
		k/=2;
		
		int[][] rightCost=new int[w-1][h];
		int[][] downCost=new int[w][h-1];
		for (int y=0; y<h; y++) 
			for (int x=0; x<w-1; x++)
				rightCost[x][y]=fs.nextInt();
		for (int y=0; y<h-1; y++)
			for (int x=0; x<w; x++)
				 downCost[x][y]=fs.nextInt();
		
		long[][] dp=new long[w][h];
		long[][] dpNext=new long[w][h];
		for (int i=0; i<k; i++) {
			for (int x=0; x<w; x++) {
				for (int y=0; y<h; y++) {
					long ans=(long)1e18;
					if (x!=0) ans=Math.min(ans, dp[x-1][y]+rightCost[x-1][y]);
					if (y!=0) ans=Math.min(ans, dp[x][y-1]+downCost[x][y-1]);
					if (x!=w-1) ans=Math.min(ans, dp[x+1][y]+rightCost[x][y]);
					if (y!=h-1) ans=Math.min(ans, dp[x][y+1]+downCost[x][y]);
					dpNext[x][y]=ans;
				}
			}
			dp=dpNext;
			dpNext=new long[w][h];
		}
		//TODO: double answer
		for (int y=0; y<h; y++) {
			for (int x=0; x<w; x++) {
				if (x!=0) out.print(" ");
				out.print(2*dp[x][y]);
			}
			out.println();
		}
		out.close();
	}
}