public class Main{	public static void main(String[] args) throws IOException {
		
		//Scanner sc=new Scanner(System.in);
		in=new InputReader(System.in);
		out=new PrintWriter(System.out);
		String n1=in.readString();
		String s1=in.readString();
		long s=Long.parseLong(s1);
		long n=Long.parseLong(n1);
		
		long l=s-1;
		long r=n+1;
		HashSet<Long> hset=new HashSet<>();
		long last=-1;
		while(l<r)
		{
			long mid=(l+r)/2;
			long sum=0;
			if(hset.contains(mid))
				break;
			String d=String.valueOf(mid);
			for(int i=0;i<d.length();i++)
			{
				sum=sum+(d.charAt(i)-'0');
			}
			//debug(sum);
			hset.add(mid);
			
			if(mid-sum>=s)
			{
				last=mid;
				r=mid;
			}
			else
			{
				l=mid;
			}
		}
		if(last==-1)
			out.println("0");
		else
		{
			out.println(n-last+1);
		}
		out.close();
		}
}