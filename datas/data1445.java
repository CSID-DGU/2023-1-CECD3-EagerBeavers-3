public class Main{    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in=new Scanner(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        
        n=in.nextLong();
        x=in.nextLong();
        y=in.nextLong();
        c=in.nextLong();
        
        
        
        
        long l=0;
        long r=2*n;
        while(l<r){
            long m=(l+r)/2;
            long ff=f(m);
            if(ff<c){
                l=m+1;
            }
            else{
                r=m;
            }
        }
        out.println(l);
        out.close();
    }
}