public class Main{    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(new File("input.txt")/*System.in*/);
        int n = s.nextInt();
        int m = s.nextInt();
        int k = s.nextInt();
//        pair[] arr = new pair[n];
        Queue<pair> q = new LinkedList<>();
        PrintWriter out = new PrintWriter(new FileWriter("output.txt"));
        boolean[][] visited = new boolean[n][m];
        for (int i = 0; i < k; i++) {
            int x = s.nextInt() - 1;
            int y  = s.nextInt() - 1;
            visited[x][y] = true;
            pair p = new pair(x,y);
//            arr[i] = p;
            q.add(p);
        }

        q.add(null);
        int[] dx = {0,0,1,-1};
        int[] dy = {1,-1,0,0};
        int ansX = q.peek().x;
        int ansY = q.peek().y;
        while(true){
            if(q.peek() == null){
                q.poll();
                q.add(null);
            }
            pair p = q.poll();
            if(p == null){
                break;
            }
            for (int i = 0; i < 4; i++) {
                if(isValid(p.x + dx[i],p.y+dy[i],n,m) && !visited[p.x + dx[i]][p.y+dy[i]]){
                    q.add(new pair(p.x + dx[i],p.y+dy[i]));
                    ansX = p.x + dx[i];
                    ansY = p.y + dy[i];
                    visited[ansX][ansY] = true;
                }
            }
        }
        out.println((ansX+1) + " " + (ansY+1));
        out.close();

    }
}