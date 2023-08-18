public class Main{	public static void main(String[] args)
   {
       InputReader in=new InputReader(System.in);
       PrintWriter pw = new PrintWriter(System.out);
       int n=in.nextInt();
       int total=in.nextInt();
       int t[]=new int[n];
       int g[]=new int[n];
       for(int i=0;i<n;i++) {
    	   t[i]=in.nextInt();
    	   g[i]=in.nextInt();
       }
       long ans=0L;
       for(int i=0;i<(1<<n);i++) {
    	   int sum=0;
    	   int a[]=new int[4];
    	   for(int j=0;j<n;j++) {
    		   
    		   if(((i>>j)&1)==1) {
    			   sum+=t[j];
    			   a[g[j]]++;
    		   }
    	   }
    	   if(sum==total) {
    		   ini();
    		   ans=(ans+f(a[1],a[2],a[3],0))%mod;
    	   }
       }
       pw.println(ans);
       pw.flush();
       pw.close();
        
        
        }
}