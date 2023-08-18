public class Main{    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] line = in.readLine().split(" ");
        int Xs = Integer.parseInt(line[0]);
        int Ys = Integer.parseInt(line[1]);
        int n = Integer.parseInt(in.readLine());
        
        int[][] points = new int[n+1][2];
        points[n][0] = Xs;//set starting point as last point for finding distances
        points[n][1] = Ys;
        
        for(int i=0; i< n ; i++)
        {
            line = in.readLine().split(" ");
            points[i][0] = Integer.parseInt(line[0]);
            points[i][1] = Integer.parseInt(line[1]);
        }
        
        
        int[][] distances = new int[n+1][n+1];
        ComputeDistances(points, distances, n);
        
        int[] dp = new int[1<<n];
        int[] path = new int[1<<n];
        ComputeLowestPath(dp, path, distances, n);
        OutputLowestAndPath(dp, path, n);
        
    }
}