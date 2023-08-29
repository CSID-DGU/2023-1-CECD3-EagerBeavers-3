public class Main{	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long n = in.nextLong();
		long x = in.nextLong()-1;
		long y = in.nextLong()-1;
		long c = in.nextLong();
		
		long lo = 0, hi = 2*n+10;
		while(hi - lo > 2) {
			long mid = (hi+lo)/2;
			if(calc(n,x,y,mid) >= c)
				hi = mid;
			else
				lo = mid;
		}
		while(calc(n,x,y,lo) < c) lo++;
		System.out.println(lo);
	}
}