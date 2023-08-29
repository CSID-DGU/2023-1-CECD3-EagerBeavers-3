public class Main{	public static void main(String[] args) throws IOException
	{
		in=new InputReader(System.in);
	    w=new PrintWriter(System.out);

	   int n=ni();
	   HashMap<String,Integer> hm=new HashMap<String,Integer>();
	   for(int i=0;i<n;i++)
	   {
		   String s=ns();
		   if(hm.containsKey(s))
			   hm.put(s,hm.get(s)+1);
		   else
			   hm.put(s,1);
	   }
	    
	   int ans=0;
	   for(int i=0;i<n;i++)
	   {
		   String s=ns();
		   if(hm.containsKey(s))
		   {
			   if(hm.get(s)==1)
				   hm.remove(s);
			   else
				   hm.put(s,hm.get(s)-1);
		   }
		   else
		   {
			   ans++;
			/*   if(s.length()==1)
			   {
				   if(s.equals("M"))
				   {
					   if(hm.containsKey("S"))
					   {
						   if(hm.get("S")==1)
							   hm.remove("S");
						   else
							   hm.put(s,hm.get("S")-1);
					   }
					   else if(hm.containsKey("L"))
					   {
						   if(hm.get("L")==1)
							   hm.remove("L");
						   else
							   hm.put(s,hm.get("L")-1);
					   }
				   }
				   else if()
				   
			   }*/
		   }
	   }
	   w.print(ans);
       w.close();
	}
}