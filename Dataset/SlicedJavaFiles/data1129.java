public class Main{	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long n = scanner.nextLong();
		long s = scanner.nextLong();
		long l = 1;
		long r = Long.MAX_VALUE;
		long index = 0;
		while(l <= r) {
			long mid = (l + r) / 2;
			if(mid - get(mid) >= s) {
				index = mid;
				r = mid - 1;
			}else{
				l = mid + 1;
			}
		}
		System.out.println(Math.max(0, n-index+1));
	}
}