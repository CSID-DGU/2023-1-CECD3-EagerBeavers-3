public class Main{	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		int n = sc.nextInt();
		int r = sc.nextInt();
		
		double ans[] = new double[n];
		
		int[] x = new int[n];
		
		for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
		}
		
		for (int i = 0; i < n; i++) {
			ans[i] = r;
			for (int j = 0; j < i; j++) {
				int d = Math.abs(x[i] - x[j]);
				if(d <= 2 * r) {
					ans[i] = Math.max(ans[i], ans[j] + Math.sqrt(4 * r * r - d * d));
				}
			}
			
			out.print(ans[i] + " ");
		}
		out.println();
		
		out.flush();
		out.close();
	}
}