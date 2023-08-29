public class Main{    public static void main(String[] args) throws Exception{
        FastReader sc=new FastReader(); 
        OutputStream outputStream = System.out;
        PrintWriter out = new PrintWriter(outputStream);
        Main mm=new Main();
        long n=sc.nextLong();
        long k=sc.nextLong();
        long l=0;
        long r=1000000000;
        long ans=-1;
        while(l<=r) {
            long mid=(l+r)/2;
            if(n-mid<=0) {
                r=mid-1;
            }
            else {
                long temp=(n-mid)*(n-mid+1)-(2*mid);
                if(temp==2*k) {
                    ans=mid;
                    break;
                }
                else if(temp<2*k) {
                    r=mid-1;
                }
                else if(temp>2*k) {
                    l=mid+1;
                }
            }
        }
        System.out.println(ans);
    }  
}