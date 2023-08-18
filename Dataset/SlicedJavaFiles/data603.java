public class Main{    public static void main(String[] args)
    {
        InputReader in = new InputReader(System.in);
        OutputWriter out = new OutputWriter(System.out);
         int n = in.nextInt();
         int d = in.nextInt();
         int[]a = new int[n];
         int ans=2;

         for (int i =0;i<n;i++)
         {
             a[i] = in.nextInt();

         }
         for (int i =0;i<n-1;i++)
         {

             if (a[i+1]-a[i]==2*d)
                 ans++;
             if (a[i+1]-a[i]>2*d)
                 ans+=2;
         }
         out.printLine(ans);
        out.flush();
    }
}