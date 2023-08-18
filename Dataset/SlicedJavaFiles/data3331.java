public class Main{    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        int[] edgeFrom = new int[M];
        int[] edgeTo = new int[M];
        for (int i = 0; i < M; i++) {
        	edgeFrom[i] = sc.nextInt();
        	edgeTo[i] = sc.nextInt();
        }
        
        int best = Integer.MAX_VALUE;
    	boolean[][] adjMat = makeAdjMat(N, edgeFrom, edgeTo);
        for (int i = 0; i < N; i++) {
        	boolean[][] mat = copyOfArray2d(adjMat);
        	best = Math.min(best, count(mat, M, i));
        }
        
        System.out.println(best);
    }
}