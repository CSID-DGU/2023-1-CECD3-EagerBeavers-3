public class Main{	public static void main (String[] args) throws java.lang.Exception
	{   int i,j;
		long flag,flag1,flag2,temp,temp2,temp1,count,counter,l;
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		/*
		    if(hm.containsKey(z))
		        hm.put(z,hm.get(z)+1);
		    else
		        hm.put(z,1);
		 */       
        ArrayList<Integer> arr=new ArrayList<Integer>();
        HashSet<Integer> set=new HashSet<Integer>();
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
        
        
       //for(i=1;i<200;i++)
       //{
        long k=in.nl();
		temp=9;l=1;temp2=0;
		while(true)
		{   if(k<=temp2+temp*l)
		        {k-=temp2;break;}
		    else
		    {   temp2+=temp*l;
		        temp*=10;
		        l++;
		    }      
		}
		long z=((k-1)/l);
		//out.println(i+":- "+l+" "+((k-1)/l)+"  "+(k%l==0?l:k%l));
		long no=(long)Math.pow(10,(l-1))+z;
		//out.println(no);
		int index=(int)(k%l==0?l:k%l)-1;
		String p=Long.toString(no);
		//out.println(p+" "+index);
		out.println(p.charAt(index));
       //}
		out.close();
	}
}