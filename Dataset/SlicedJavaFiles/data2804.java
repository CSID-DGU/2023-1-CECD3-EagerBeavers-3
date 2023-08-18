public class Main{	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int testCase = sc.nextInt();

		while (testCase-- > 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			if (n < m) {
				int temp = n;
				n = m;
				m = temp;
			}	

			int ans = gcd (n , m);
			System.out.println(ans);
		}
	}
}