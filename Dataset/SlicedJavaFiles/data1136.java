public class Main{	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long n = scan.nextLong();
		long s = scan.nextLong();
		long ans = 0;
		long l = 0;
        long r = n;
        while (l <= r) {
            // Key is in a[lo..hi] or not present.
            long mid = l + (r - l) / 2;
            if(isReallyBig(mid, s)){
            	ans = mid;
            	r = mid-1;
            }
            else l = mid+1;
        }
        if(ans == 0) System.out.println(ans);
        else
        	System.out.println(n-ans+1);
	}
}