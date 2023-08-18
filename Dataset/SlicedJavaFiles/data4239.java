public class Main{    public static void main(String[] args) throws IOException {
        FastScanner sc = new FastScanner();
        int Q = sc.nextInt();
        for (int q = 0; q < Q; q++) {
        	int N = sc.nextInt();
        	int M = sc.nextInt();
        	int[][] grid = new int[N][M];
        	int[][] maxes = new int[M][2];
        	for (int i = 0; i < M; i++)
        		maxes[i][1] = i;
        	for (int i = 0; i < N; i++) {
        		for (int j = 0; j < M; j++) {
        			grid[i][j] = sc.nextInt();
        			maxes[j][0] = Math.max(maxes[j][0],grid[i][j]);
        		}
        	}
        	maxes = sort(maxes);
        	int[] keyCols = new int[Math.min(M, N)];
        	for (int i = 0; i < keyCols.length; i++)
        		keyCols[i] = maxes[i][1];
        	
        	int ans = 0;
        	for (int x = 0; x < (int)Math.pow(N,N); x++) {
        		int[] base = baseN(keyCols.length,x);
        		int ansx = 0;
        		for (int i = 0; i < N; i++) {
            		int r = 0;
            		for (int j = 0; j < keyCols.length; j++) {
            			r = Math.max(r,grid[(i+base[j])%N][keyCols[j]]);
            		}
            		ansx += r;
        		}
        		ans = Math.max(ans,ansx);
        	}
        	System.out.println(ans);
        }
    }
}