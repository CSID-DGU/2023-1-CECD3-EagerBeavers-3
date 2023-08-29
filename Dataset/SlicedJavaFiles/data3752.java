public class Main{    public static void main(String args[]) throws Exception
    {
		int n=sc.nextInt();build();
		
		int[] a=new int[n];parent=new int[n];size=new int[n];
		
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			
			parent[i]=i;
			
			size[i]=1;
		}
		
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				long curr=a[i]*1L*a[j],now=(long)Math.sqrt(curr);
				
				if(now*now==curr)
				{
					merge(i,j);
				}
			}
		}
		
		List<Integer> list=new ArrayList<>();
		
		for(int i=0;i<n;i++)
		{
			if(getParent(i)==i)
			{
				list.add(size[i]);
			}
		}
		
	//	out.println(list);
		
		int res=0;int[] poly=new int[1];poly[0]=1;
		
		for(int i=0;i<list.size();i++)
		{
			int size=list.get(i);
			
			int[] arr=new int[size];arr[0]=1;
			
			for(int j=1;j<size;j++)
			{
				int now1=C(size,j),now2=mul(fact[size-1],inv_fact[size-1-j]);
				
				int qq=mul(now1,now2);
				
				arr[j]=qq;
			}
			
			poly=mul_poly(poly,arr,poly.length-1,size-1);
		}
		
		for(int i=1,x=1;i<poly.length;i++,x*=-1)
		{
			int now=add(x,mod);
			
			int curr=mul(fact[n-i],poly[i]);
			
			curr=mul(curr,now);
			
			res=add(res,curr);
		}
		
	//	out.println(res);
		
		int zz=mul(res,mod-1);res=add(fact[n],zz);
		
		out.println(res);out.close();
    }
}