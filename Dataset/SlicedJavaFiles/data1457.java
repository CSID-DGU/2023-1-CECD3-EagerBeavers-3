public class Main{    public static void main(String[] args)throws IOException
    {
        PrintWriter out= new PrintWriter(System.out);
        Reader sc=new Reader();
        long n=sc.l();
        long x=sc.l();
        long y=sc.l();
        long c=sc.l();
        long low=0;
        long high=(long)Math.pow(10,9);
        while(low<high)
        {
            long mid=(low+high)/2;
            if(check(mid,x,y,n)>=c)
            high=mid;
            else
            low=mid+1;
        }
        out.println(low);
        out.flush();
    }
}