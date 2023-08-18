public class Main{	public static void main (String [] arg) throws Throwable {
		int n = nextInt();
		int k = nextInt();
		
		long ate = 0;
		long ans = -1;
		for (long i = 1; ans < 0; ++i) {
			long test = (i * (i+1)) / 2;
			if (test < k) continue;
			
			long adding_moves = i;
			long eating_moves = n-i;
			if (test - eating_moves == k) ans = eating_moves;
		}
		System.out.println(ans);
		
	}
}