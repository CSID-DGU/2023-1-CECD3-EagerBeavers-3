public class Main{    public static void main(String[] args)throws Throwable {
        MyScanner sc=new MyScanner();
        PrintWriter pw=new PrintWriter(System.out);

        int n=sc.nextInt();
        int d=sc.nextInt();
        int [] a=new int [n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        int ans=2;
        for(int i=0;i<n-1;i++){
            if(a[i+1]-a[i]<2*d)
                continue;
            if(a[i+1]-a[i]==2*d)
                ans++;
            else
                ans+=2;
        }
        pw.println(ans);
        pw.flush();
        pw.close();
    }
}