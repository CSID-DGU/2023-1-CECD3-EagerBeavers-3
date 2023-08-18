public class Main{	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long n = sc.nextLong();
		long k = sc.nextLong();
		System.out.println(solve(n, k));

		sc.close();
	}
}