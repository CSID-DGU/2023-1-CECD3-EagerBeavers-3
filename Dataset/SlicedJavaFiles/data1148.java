public class Main{	public static void main(String[] args) {
		InputReader sc=new InputReader(System.in);
		long n=sc.nextLong();
		long s=sc.nextLong();
		
		long start=0,end=n;
		while(start<end)
		{
			long mid=(start+end)/2;
			if(func(mid)>=s)
				end=mid;
			else 
				start=mid+1;
		}
		if(func(start)>=s)
			System.out.println(n-start+1);
		else
			System.out.println(0);
	}
}