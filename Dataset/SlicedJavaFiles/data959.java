public class Main{    public static void main(String[] args) throws Exception{
        //MScanner sc = new MScanner("chess.in");
        MScanner sc = new MScanner(System.in);
        PrintWriter pw=new PrintWriter(System.out);
        int n=sc.nextInt();
        //int[]in=new int[n];for(int i=0;i<n;i++)in[i]=sc.nextInt();
        int k=sc.nextInt();
        int x=(-3+(int)Math.sqrt(9+4*1.0*(2*k*1.0+2*n*1.0)))/2;
        pw.println(n-x);
        pw.flush();
    }
}