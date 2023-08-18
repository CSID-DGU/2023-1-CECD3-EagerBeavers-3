public class Main{	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long n = scan.nextLong();
		long s = scan.nextLong();
		scan.close();
		long start = s - s % 10;
		while (start <= n && !isBig(start, s)) {
			start += 10;
		}
		if (start > n) {
			System.out.println(0);
		} else {
			System.out.println(n - start + 1);
		}
	}
}