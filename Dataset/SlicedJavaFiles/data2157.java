public class Main{	public static void main (String[] args) throws java.lang.Exception
	{
	    int n,r;
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    n=Integer.parseInt(st.nextToken());
	    r=Integer.parseInt(st.nextToken());
	    
	    int arr[] = new int[n+1];
	    double cen[] = new double[n+1];
	    
	    int i,j;
	    
	    for(i=1;i<=n;i++)
	    cen[i]=-1.0;
	    
	    st = new StringTokenizer(br.readLine());
	    for(i=1;i<=n;i++)arr[i]=Integer.parseInt(st.nextToken());
	    
	    for(i=1;i<=n;i++)
	    {
	        int f=0;
	        double max=-1.0;
	        for(j=1;j<=n;j++)
	        {
	            if(i!=j && cen[j]!=-1.0 && (Math.abs(arr[i]-arr[j])<=2*r))
	            {
	                max=Math.max(max,cal(arr[j],cen[j],arr[i],r));
	                f=1;
	                
	            }
	        }
	       // System.out.println(i+" "+max);
	        if(f==1)
	        cen[i]=max;
	        else
	        cen[i]=r*1.0;
	    }
	    for(i=1;i<=n;i++)
	    System.out.print(cen[i]+" ");
	}
}