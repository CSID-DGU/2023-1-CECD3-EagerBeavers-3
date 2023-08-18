public class Main{    public static void main(String args[] ) throws Exception{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int n,i,j,k,temp ;
       n = ni(br.readLine());
       int[] a = nia(br);
       Arrays.sort(a);
       int c = 0;
       for( i = 0; i< n ; i++) {
    	   if(a[i] > 0) {
    		   c++;
    		   temp = a[i];
    		   for(j = i+1; j< n; j++) {
    			   if(a[j] % temp == 0)
    				    a[j] = 0;
    		   }
    	   }
       }
       
       
       System.out.println(c);
	
    }
}