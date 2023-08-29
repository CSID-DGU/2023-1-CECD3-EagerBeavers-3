public class Main{      public static void main(String hi[]) throws Exception
      {
         BufferedReader infile = new BufferedReader(new FileReader("input.txt"));
         StringTokenizer st = new StringTokenizer(infile.readLine());
         int N = Integer.parseInt(st.nextToken());
         int M = Integer.parseInt(st.nextToken());
         int K = Integer.parseInt(infile.readLine());
         int[][] grid = new int[N][M];
         for(int i=0; i < N; i++)
            Arrays.fill(grid[i], -1);
         ArrayDeque<Integer> q = new ArrayDeque<Integer>();
         st = new StringTokenizer(infile.readLine());
         while(K-->0)
         {
            int a = Integer.parseInt(st.nextToken())-1;
            int b = Integer.parseInt(st.nextToken())-1;
            grid[a][b] = 0;
            q.add(a);   q.add(b);
         }
         while(q.size() > 0)
         {
            int x = q.poll();
            int y = q.poll();
            if(x > 0 && grid[x-1][y] == -1)
            {
               grid[x-1][y] = grid[x][y]+1;
               q.add(x-1); q.add(y);
            }
            if(y > 0 && grid[x][y-1] == -1)
            {
               grid[x][y-1] = grid[x][y]+1;
               q.add(x);   q.add(y-1);
            }
            if(x+1 < N && grid[x+1][y] == -1)
            {
               grid[x+1][y] = grid[x][y]+1;
               q.add(x+1); q.add(y);
            }
            if(y+1 < M && grid[x][y+1] == -1)
            {
               grid[x][y+1] = grid[x][y]+1;
               q.add(x);   q.add(y+1);
            }
         }
         int r = 0;
         int c = 0;
         for(int i=0; i < N; i++)
            for(int j=0; j < M; j++)
               if(grid[r][c] < grid[i][j])
               {
                  r = i;
                  c = j;
               }
         r++;  c++;
         System.setOut(new PrintStream(new File("output.txt")));
         System.out.println(r+" "+c);
      }
}