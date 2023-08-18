public class Main{	public static void main(String[] args){
		FastScanner sc = new FastScanner();
		long n = sc.nextLong() - 1;
		long k = sc.nextInt() - 1;
		
		if(n==0){
			System.out.println(0);
			return;
		}else if(n <= k){
			System.out.println(1);
			return;
		}else if(n > k*(k+1)/2){
			System.out.println(-1);
			return;
		}
		
		//n > k, and there exists a subset (1..k) = n
		//goal : sum( subset of (1...k) ) = n
		//obs: if exists a soln, it's always possible to push everything to the right-> t + left...k
		//so that t + left...k = n, so we just have to find the smallest left such that left..k <= n
		long rightSum = k*(k+1)/2;
		long lo = 1;
		long hi = k;
		while(lo < hi){
			long mid = lo + (hi-lo+1)/2;
			long val = rightSum - mid*(mid-1)/2;
			
			if(val <= n){
				hi = mid -1;
			}else{
				lo = mid;
			}
		}
		//now lo points to the greatest left for which left..k > n
		//so lo+1 points to the smallest left for which left..k <= n
		//we still have an extra 't' to the left
		if(rightSum - (lo+1)*(lo)/2 == n){
			System.out.println(k - (lo+1) + 1);
		}else{
			System.out.println(1 + (k - (lo+1) + 1));
		}
	}
}