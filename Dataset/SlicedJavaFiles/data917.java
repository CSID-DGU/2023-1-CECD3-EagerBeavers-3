public class Main{	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		// FileWriter f = new FileWriter("C:\\Users\\Hp\\Desktop\\out.txt");
		PrintWriter pw = new PrintWriter(System.out);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int sum = n;

		for (long i = 0; i < 1e5; i++) {
			if (i * (i + 1) / 2 - (n - i) == k) {
				System.out.println(n - i);
				break;
			}
		}
	}
}