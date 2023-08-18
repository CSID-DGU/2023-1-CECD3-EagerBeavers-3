public class Main{    public static void main(String[] args) throws IOException {
//        FastReader sc = new FastReader();
        Scanner sc=new Scanner(new FileReader("input.txt"));
        PrintWriter out=new PrintWriter(new File("output.txt"));
        int n=sc.nextInt(),m=sc.nextInt(),k=sc.nextInt();
        boolean vis[][]=new boolean[n][m];
        LinkedList<Integer> q=new LinkedList<>();
        for (int i=0;i<k;i++){
            int x=sc.nextInt()-1,y=sc.nextInt()-1;
            vis[x][y]=true;
            q.add(x);q.add(y);
        }
        int lastx=-1,lasty=-1;
        int dirX[]={1,-1,0,0},dirY[]={0,0,1,-1};
        while (!q.isEmpty()){
            int x=q.removeFirst();
            int y=q.removeFirst();
            lastx=x;lasty=y;
            for (int i=0;i<4;i++){
                int newx=x+dirX[i],newy=y+dirY[i];
                if (newx>=0 && newx<n && newy>=0 && newy<m && !vis[newx][newy]){
                    vis[newx][newy]=true;
                    q.add(newx);q.add(newy);
                }
            }
        }
        out.println((lastx+1)+" "+(lasty+1));
        out.close();
    }
}