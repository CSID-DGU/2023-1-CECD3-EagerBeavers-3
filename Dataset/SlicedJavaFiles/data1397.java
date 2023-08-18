public class Main{    public static void main(String args[]) throws IOException
        {
        Scanner c=new Scanner(System.in);
        PrintWriter out=new PrintWriter(System.out);
        long N=c.nextLong()-1;
        long K=c.nextLong()-1;
        long tot=(K*(K+1))/2;
        //System.out.println(tot);
        if(N>tot)
            {
            System.out.println(-1);
            return;
            }
        long lo=1;
        long hi=K;
        while(hi-lo>=10)
            {
            long mid=(hi+lo)/2;
            //maximum outlets using mid pipes
            long sum=(mid*(mid-1))/2;
            long left=mid*K-sum;
            if(left>=N)
                hi=mid+1;
            else
                lo=mid-1;
            }
        for(int num=(int)lo-1000;num<lo+1000;num++)
            {
            if(num>=0)
                {
                long sum=((long)num*(num-1))/2;
                long left=(long)num*K-sum;
                if(left>=N)
                    {
                    System.out.println(num);
                    return;
                    }
                }
            }
        out.close();
        }
}