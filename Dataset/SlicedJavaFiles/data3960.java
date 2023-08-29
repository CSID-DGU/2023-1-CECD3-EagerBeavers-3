public class Main{    public static void main(String[] args) throws  Exception
    {

//
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter((System.out));
        n = in.nextInt();
        m = in.nextInt();


            for(int i = 1 ; i <= n ; i++)
            {
                for (int j = 1; j <= n; j++)
                {
                    a[i][j] = in.nextInt();
                }
            }
            dfs(1);
           out.printf( "%.10f", (double) m * m * (cnt-1) / (2 * cnt ));


        out.println();
        out.close();
        return;
    }
}