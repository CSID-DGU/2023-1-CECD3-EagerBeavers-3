public class Main{	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		long n = sc.nextLong();
		Long S = sc.nextLong();
		
		long l = 0;
		long h = n;
		
		long ans = n;
		
		while(l <= h) {
			long mid = (l + h) / 2;
			long t = mid;
			long sum = 0;
			
			while(t > 0) {
				sum += t % 10;
				t /= 10;
			}
			
			if(mid - sum < S) {
				ans = mid;
				l = mid + 1;
			}else
				h = mid - 1;
		}
		
		out.println(n - ans);

		out.flush();
		out.close();
	}
}