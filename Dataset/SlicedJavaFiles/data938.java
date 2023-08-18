public class Main{	public static void main(String[] args)
	{
		JS scan = new JS();
		long n = scan.nextInt();
		long put = 1;
		long k = scan.nextInt();
		long have = 0;
		long moves = 0;
		while(have < k) {
			have += put;
			put++;
			moves++;
		}
		
		long ans = 0;
		moves += have-k;
		ans += have-k;
		long lo = 0;
		long hi = n-moves;
		long bs = 0;
		while(lo <= hi) {
			//could she have eaten mid candies?
			long mid = (lo+hi)/2;
			long left = (n-moves)-mid+put-1;
			long rr = tri(left)-tri(put);
			
			if(rr <= mid) {
				bs = mid;
				hi = mid-1;
			}
			else {
				lo = mid+1;
			}
		}
		System.out.println(ans+bs);
	}
}