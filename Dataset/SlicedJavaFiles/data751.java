public class Main{    public static void main(String[] args) throws Exception{           	
    	 InputReader in = new InputReader(System.in);       
    	PrintWriter pw=new PrintWriter(System.out);   
    	
    	
    	//int t=in.readInt();
        //while(t-->0)
        //{
    	
        int n=in.readInt();
    	//long n=in.readLong();
    	/*int a[]=new int[n];
    	for(int i=0;i<n;i++)
    	{
    		a[i]=in.readInt();
    	}*/
    	String a=in.readString();
    	char c[]=a.toCharArray();
    	HashSet<Character>ht=new HashSet<Character>();
    	Deque<Character>q=new LinkedList<Character>();
    	HashSet<Character>hs=new HashSet<Character>();
    	HashMap<Character,Integer>hm=new HashMap<Character,Integer>();
    	for(int i=0;i<n;i++)
    	{
    		ht.add(c[i]);
    	}
    	int t=ht.size();
    	q.addLast(c[0]);
    	hs.add(c[0]);
    	hm.put(c[0],1);
    	int ans=Integer.MAX_VALUE;
    	if(hs.size()==t)
		{   			
			ans=min(ans,q.size());
		}
    	
    	for(int i=1;i<n;i++)
    	{
    		q.addLast(c[i]);
			hs.add(c[i]);
			if(hm.containsKey(c[i]))
			{
				int x=hm.get(c[i]);
				hm.put(c[i],x+1);
			}
			else
				hm.put(c[i],1);
    		while(hs.size()==t)
    		{   			
    			ans=min(ans,q.size());
    			char ch=q.peekFirst();
    			int x=hm.get(ch);
    			if(x==1)
    				break;
    			else
    				{
    				hm.put(ch, x-1);
    				q.pollFirst();
    				}
    			
    		}
    		    			
    		
    	}
		pw.println(ans);	     	
    	
    	//}
    	
    	pw.close();
    }
}