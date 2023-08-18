public class Main{	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		long n = scan.nextLong();
		long s = scan.nextLong();
		long low = 0;
		long high = n + 1;
		while (high-low>1) {
			long sum = 0;
			long mid = (high + low) / 2;
			long value = findSum(mid, sum);
			if (mid - value >= s)
				high = mid;
			else
				low = mid;
		}
		
		System.out.println(n - high + 1);

		scan.close();
	}
}