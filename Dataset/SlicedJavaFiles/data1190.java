public class Main{	public static void main(String[] args) {

		long n = in.nextLong();
		long s = in.nextLong();
		
		if(diff(n) < s) {
			System.out.println(0);
			out.close();
			return;
		}
		
		long lo = 1;
		long hi = n;
		while(lo < hi) {
			long mid = lo + (hi - lo) / 2;
			if(diff(mid) >= s)
				hi = mid;
			else
				lo = mid + 1;
		}
		System.out.println(n - lo + 1);
		
		out.close();
	}
}