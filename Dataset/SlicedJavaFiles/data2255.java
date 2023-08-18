public class Main{	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		arr = new char[n];
		for (int i = 0; i < n; i++)
			arr[i] = sc.next().charAt(0);
		memo = new int[n + 1][n + 1];
		for (int[] x : memo)
			Arrays.fill(x, -1);
		System.out.println(solve(0, 0));
	}
}