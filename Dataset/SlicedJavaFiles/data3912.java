public class Main{	public static void main(String[] args) throws IOException 
	{
		Reader sc=new Reader();Solution G=new Solution();//MyMath mm=new MyMath();
		PrintWriter o = new PrintWriter(System.out);
		int t=1;t=sc.nextInt();
		int mod=(int)1e9+7;
		int x,x0,x1,x2;int y,y0,y1,y2;int s,s0,s1,s2;
		int n,m;int a[],b[],in[],in1[];
		long k,l;boolean v[],b1,b2;String ss;char c1[];
		//long l;long a[]; 
		ArrayList<ArrayList<Integer>> ll=new ArrayList<>();
		ArrayList<Integer> a1=new ArrayList<>();
		ArrayList<Integer> a2=new ArrayList<>();
		PriorityQueue<Integer> pq1=new PriorityQueue<>();
		PriorityQueue<Integer> pq2=new PriorityQueue<>(Collections.reverseOrder());
		ArrayDeque<Integer> dq=new ArrayDeque<>();
		TreeSet<Integer> h0=new TreeSet<>();
		TreeSet<Integer> h1=new TreeSet<>();
		TreeMap<Integer,Integer> h=new TreeMap<>();
		try{
		while (t-->0)
		{
		    n=sc.nextInt();a=sc.nextArr(n);b=new int[(int)1e4];
		    a1.add(a[0]);b[1]=a[0];
		    for (int i=1;i<n;i++)
		    {
		        G.func(o,a1);
		        x=a1.get(a1.size()-1);
		        if (a[i]==1)
		        {
		            a1.add(a[i]);
		            b[a1.size()]=a[i];
		        }
		        else if (a[i]==x+1)
		        {
		            a1.remove(a1.size()-1);
		            a1.add(a[i]);
		            b[a1.size()]=a[i];
		        }
		        else
		        {
		            while (a1.get(a1.size()-1)!=a[i]-1)
		            a1.remove(a1.size()-1);
		            a1.remove(a1.size()-1);
		            a1.add(a[i]);
		        }
		    }
		    G.func(o,a1);
		    //o.println();
		    //o.println(n);
		    //o.println();
		    //o.println();
		    //o.println(h);
		    //o.println(x2);
		    //o.println();
		    h0.clear();ll.clear();a1.clear();a2.clear();h1.clear();h.clear();pq1.clear();pq2.clear();
		}
		}
		catch (Throwable e)
		{
		    e.printStackTrace();
		}
		//o.println("HI");
		
        o.flush();
        o.close();
	}
}