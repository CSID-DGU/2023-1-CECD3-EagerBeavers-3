public class Main{    public static void main(String[] args)throws IOException
    {
        /*PrintWriter out= new PrintWriter(new File("input.txt"));
        Reader sc=new Reader();*/
        Scanner sc = new Scanner(new File("input.txt"));
		PrintWriter out = new PrintWriter("output.txt");
        Queue<pair> q=new LinkedList<>();
        int n=sc.nextInt();
        int m=sc.nextInt();
        int t=sc.nextInt();
        int mark[][]=new int[n+2][m+2];
        while(t-->0)
        {
            int a=sc.nextInt();int b=sc.nextInt();
            mark[a][b]=1;
            q.add(new pair(a,b));
        }
        int ansx=1;int ansy=1;
        while(q.size()!=0)
        {
            pair p=q.remove();
            if(mark[Math.max(1,p.x-1)][p.y]==0)
            {
                q.add(new pair(Math.max(1,p.x-1),p.y));
                mark[Math.max(1,p.x-1)][p.y]=1;
                ansx=Math.max(1,p.x-1);
                ansy=p.y;
            }
            if(mark[Math.min(n,p.x+1)][p.y]==0)
            {
                q.add(new pair(Math.min(n,p.x+1),p.y));
                mark[Math.min(n,p.x+1)][p.y]=1;
                ansx=Math.min(n,p.x+1);
                ansy=p.y;
            }
            if(mark[p.x][Math.max(1,p.y-1)]==0)
            {
                q.add(new pair(p.x,Math.max(1,p.y-1)));
                mark[p.x][Math.max(1,p.y-1)]=1;
                ansx=p.x;
                ansy=Math.max(1,p.y-1);
            }
            if(mark[p.x][Math.min(m,p.y+1)]==0)
            {
                q.add(new pair(p.x,Math.min(m,p.y+1)));
                mark[p.x][Math.min(m,p.y+1)]=1;
                ansx=p.x;
                ansy=Math.min(m,p.y+1);
            }
        }
        out.println(ansx+" "+ansy);
        out.flush();
    }
}