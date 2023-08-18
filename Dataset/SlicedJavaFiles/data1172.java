public class Main{	public static void main(String[] args) throws InterruptedException{
		FastScanner scan = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		long n = scan.nextLong(), s = scan.nextLong();
		long lo = 1, hi = n+1;
		for(int bs = 0; bs < 100; bs++) {
			long mid = (lo+hi)>>1;
			long mid2 = mid;
			long c = 0;
			while(mid > 0) {
				c += mid%10;
				mid /= 10;
			}
			if(mid2-c < s) lo = mid2;
			else hi = mid2;
		}
		out.println(n-lo);
		out.close();
	}
}