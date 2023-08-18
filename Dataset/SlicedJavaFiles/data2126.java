public class Main{	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		double[] ans = new double[n];

		for (int i = 0; i < n; i++) {
			double max = 0;
			for (int j = 0; j < i; j++) {
				int difx = Math.abs(arr[i] - arr[j]);
				if (difx <= 2 * r) {
					max = Math.max(max, ans[j] + Math.sqrt(4 * r * r - difx * difx));
				}
			}
			ans[i] = max;
		}
		PrintWriter pw = new PrintWriter(System.out);
		for (int i = 0; i < n; i++)
			pw.print(ans[i] + r + " ");
		pw.flush();
	}
}