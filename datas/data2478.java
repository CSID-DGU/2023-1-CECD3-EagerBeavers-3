public class Main{	public static void main(String[] args) 
	{
		OutputStream outputStream = System.out;
        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(outputStream);
        int n = sc.nextInt();
        int a[] = new int[n];
        Pair pr;
        HashMap<Long,ArrayList> hm = new HashMap<>();
        ArrayList<Pair> ar;
        for(int i = 0; i < n; i++)
        {
        	a[i] = sc.nextInt();
        }
        long sum = 0;
        for(int r = 0; r < n; r++)
        {	
        	sum = 0;
        	for(int l = r; l >= 0; l--)
        	{
        		sum += a[l];
        		if(!hm.containsKey(sum))
        		{
        			ar = new ArrayList<>();
        			ar.add(new Pair(l,r));
        			hm.put(sum,ar);
        		}
        		else
        		{
        			ar = hm.get(sum);
        			ar.add(new Pair(l,r));
        			hm.put(sum,ar);
        		}
        	}
        }
        
        int count = 0;
        int maxCount = 0;
        long maxSum = 0;
        for(Map.Entry<Long,ArrayList> entry:hm.entrySet())
        {
        	sum = entry.getKey();
        	ar = entry.getValue();
        	count = 0;
        	int r = -1;
        	for(int i = 0; i < ar.size(); i++)
        	{
        		if(ar.get(i).l > r)
        		{
        			count++;
        			r = ar.get(i).r;
        		}
        	}
        	if(count > maxCount)
        	{
        		maxCount = count;
        		maxSum = sum;
        	}
        	
        }
        ar = hm.get(maxSum);
        out.println(maxCount);
        //out.println((ar.get(0).l+1)+" "+(ar.get(0).r+1));
        
        int r = -1;
        for(int i = 0; i < ar.size(); i++)
    	{
    		if(ar.get(i).l > r)
    		{
    			out.println((ar.get(i).l+1) +" "+(ar.get(i).r+1));
    			r = ar.get(i).r;
    		}
    	}
        out.close();
	}
}