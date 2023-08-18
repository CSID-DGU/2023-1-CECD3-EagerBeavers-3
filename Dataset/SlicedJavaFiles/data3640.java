public class Main{    public static void main(String[] args)throws IOException, URISyntaxException {
        Reader.init(new FileInputStream("input.txt"));
        StringBuilder s=new StringBuilder();
        boolean[][]vis=new boolean[Reader.nextInt()][Reader.nextInt()];
        int k=Reader.nextInt(),r,c;
        Queue<Point>q=new LinkedList<Point>();
        while(k-->0) {
            r=Reader.nextInt()-1;
            c=Reader.nextInt()-1;
            vis[r][c]=true;
            q.add(new Point(r,c));
        }
        Point end=null;
        int[]x={0,0,1,-1},y={1,-1,0,0};
        int a,b,i;
        while(!q.isEmpty()) {
            end=q.poll();
            for(i=0;i<4;i++) {
                a=end.x+x[i];
                b=end.y+y[i];
                if(a>=0&&b>=0&&a<vis.length&&b<vis[a].length&&!vis[a][b]) {
                    vis[a][b]=true;
                    q.add(new Point(a,b));
                }
            }
        }
        s.append(end.x+1).append(' ').append(end.y+1);
        PrintWriter p=new PrintWriter("output.txt");
        p.println(s);
        p.close();
    }
}