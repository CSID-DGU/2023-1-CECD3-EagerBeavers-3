public class Main{	public static void main(String[] args) throws Exception {
		reader = new BufferedReader(new InputStreamReader(System.in));
		writer = new PrintWriter(System.out);

		setTime();
		
		int n = nextInt();
		int [] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = nextInt();
		}
		int [] b = solve(a);
		for (int v: b) {
			writer.print(v + " ");
		}
		
		printTime();
		printMemory();

		writer.close();
	}
}