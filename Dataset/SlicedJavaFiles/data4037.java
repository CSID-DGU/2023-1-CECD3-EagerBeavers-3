public class Main{    public static void main(String[] args) throws IOException{
        MScanner sc = new MScanner(System.in);
        PrintWriter pw=new PrintWriter(System.out);
        n=sc.nextInt();
        t=sc.nextInt();
        ds=new int[n];gs=new int[n];
        for(int i=0;i<n;i++) {
        	ds[i]=sc.nextInt();gs[i]=sc.nextInt();
        }
        memo=new int[4][1<<n];
        for(int []i:memo)Arrays.fill(i,-1);
        pw.println(dp(0, 0,0));
        pw.flush();
    }
}