public class Main{    public static void main(String[] args) 
    { 
        FastReader sc=new FastReader();
		int n=sc.nextInt();
		Pair arr[]=new Pair[n];
		Pair pref[]=new Pair[n];
		Pair suff[]=new Pair[n];
		for( int i=0;i<n;i++)
		{
			long u=sc.nextLong();
			long v=sc.nextLong();
			arr[i]=new Pair(u,v);
			pref[i]=new Pair(0,0);
			suff[i]=new Pair(0,0);
		}
		pref[0].x=arr[0].x;
		pref[0].y=arr[0].y;
		for( int i=1;i<n;i++)
		{
			pref[i].x=(long)Math.max(pref[i-1].x,arr[i].x);
			pref[i].y=(long)Math.min(pref[i-1].y,arr[i].y);
		}
		suff[n-1].x=arr[n-1].x;
		suff[n-1].y=arr[n-1].y;
		for( int i=n-2;i>=0;i--)
		{
			suff[i].x=(long)Math.max(suff[i+1].x,arr[i].x);
			suff[i].y=(long)Math.min(suff[i+1].y,arr[i].y);
		}
		long max=Long.MIN_VALUE;
		long ans=0;
		
		for( int i=0;i<n;i++)
		{
			long val=Long.MAX_VALUE;
			long val1=Long.MAX_VALUE;
			
			if(i!=0&&i!=n-1)
			{
				 val=(long)Math.min(pref[i-1].y,suff[i+1].y)-(long)Math.max(pref[i-1].x,suff[i+1].x);
				 
			}
			else if(i!=n-1)
			{
				val=suff[i+1].y-suff[i+1].x;
			}
			else
				val=pref[i-1].y-pref[i-1].x;
			
			ans=val;
			if(ans<0)
				ans=0;
			max=(long)Math.max(ans,max);
		}
		System.out.println(max);
     
       
		
		
		
    } 
}