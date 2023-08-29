public class Main{    public static void main(String[] args) throws Exception
    {
    	FastReader in=new FastReader();
    	PrintWriter pw=new PrintWriter(System.out);
    	int n=in.nextInt();
    	int[] arr=new int[n+1];
    	for(int i=1;i<=n;i++)
    		arr[i]=in.nextInt();
    	Map<Integer,TreeMap<Integer,Integer>> map=new HashMap();
    	for(int i=1;i<=n;i++)
    	{
    		int sum=0;
    		for(int j=i;j<=n;j++)
    		{
    			sum+=arr[j];
    			if(map.containsKey(sum))
    			{
    				TreeMap<Integer,Integer> t=map.get(sum);
    				// System.out.println(t+" "+sum);
    				Map.Entry<Integer,Integer> e=t.lastEntry();
    				if(e.getKey()>j)
    				{
    					t.remove(e.getKey());
    					t.put(j,i);
    					map.put(sum,t);
    				}
    				else if(e.getKey()<i)
    				{
    					t.put(j,i);
    					map.put(sum,t);
    				}
    			}
    			else
    			{
    				TreeMap<Integer,Integer> t=new TreeMap();
    				t.put(j,i);
    				map.put(sum,t);
    			}
    		}
    	}
    	int ans=0,size=0;
    	for(Map.Entry<Integer,TreeMap<Integer,Integer>> e:map.entrySet())
    	{
    		if(e.getValue().size()>size)
    		{
    			ans=e.getKey();
    			size=e.getValue().size();
    		}
    	}
    	pw.println(size);
    	for(Map.Entry e:map.get(ans).entrySet())
    		pw.println(e.getValue()+" "+e.getKey());
    	pw.flush();
    }
}