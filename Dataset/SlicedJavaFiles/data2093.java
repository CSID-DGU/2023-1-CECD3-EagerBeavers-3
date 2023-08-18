public class Main{	public static void main(String[] args) throws IOException {
		int n = nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = nextInt();
		}
		Arrays.sort(a);
		
		for (int q = 0; q < n; q++) {
			if (a[q] != 1) {
				out.print("1");
				for (int i = 1; i < n; i++) {
					out.print(" " + a[i - 1]);
				}
				out.flush();
				return;
			}
		}
		
		for (int i = 0; i < n - 1; i++) {
			out.print("1 ");
		}
		out.println("2");
		out.flush();
		
		
	}
}