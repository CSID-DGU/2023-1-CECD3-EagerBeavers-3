public class Main{    public static void main(String[] args)throws IOException
    {
        PrintWriter out= new PrintWriter(System.out);
        Reader sc=new Reader();
        int n=sc.i();
        System.out.println("? "+1);
        int a=sc.i();
        System.out.println("? "+(1+n/2));
        int b=sc.i();
        if(a==b)
        {
            System.out.println("! "+1);
            System.exit(0);
        }
        int inv=0;
        if(a>b)
        inv=1;
        
        int low=2;
        int high=n/2;
        int q=0;
        while(low<=high)
        {
            if(q==60)
            break;
            int mid=(low+high)/2;
            System.out.println("? "+mid);
            a=sc.i();
            System.out.println("? "+(mid+n/2));
            b=sc.i();
            if(a==b)
            {
                System.out.println("! "+mid);
                System.exit(0);
            }
            else if(a<b)
            {
                if(inv==0)
                low=mid+1;
                else
                high=mid-1;
            }
            
            else
            {
                if(inv==0)
                high=mid-1;
                else
                low=mid+1;
            }
            q++;
        }
        System.out.println("! -1");
        out.flush();
    }
}