public class Main{	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long n = scn.nextLong();
		long s = scn.nextLong();

		long lo = 0;
		long hi = n ;
		while(lo<=hi)	
		{
			long mid=(lo+hi)/2; 
			if(check(mid, s))// no's greater thn this grtr
			{
				hi=mid-1;
			}
			else
			{
				lo=mid+1;
			}
			
		}
		if(check(lo, s))
		{
		System.out.println(n-lo+1);
		}
		else // could check initially too
		{
			System.out.println("0");
			
		}
	}
}