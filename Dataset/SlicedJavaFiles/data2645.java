public class Main{	public static void main(String[] args) {
		// TODO Auto-generated method stub
	FastReader in=new FastReader();
	HashMap<Integer,Integer>map=new HashMap<Integer,Integer>();
	ArrayList<Integer>list=new ArrayList<Integer>();
	TreeSet<Integer>set=new TreeSet<Integer>();

	int n=in.nextInt();
	for(int i=0;i<n;i++)
		set.add(in.nextInt());
	
	int ans=0;
	
	while(!set.isEmpty())
	{
		int f=set.first();
		int s=f;
		while(!set.isEmpty()&&s<=set.last())
		{
			if(set.contains(s))
			set.remove(new Integer(s));
			s+=f;
		}
		ans++;
		
	}
	out.println(ans);
	
	out.close();
	
	
		
	}
}