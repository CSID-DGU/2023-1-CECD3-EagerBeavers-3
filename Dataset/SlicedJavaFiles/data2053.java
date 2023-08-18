public class Main{	public static void main(String[] args) throws Exception {
		in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		out = new PrintWriter(System.out);
		
		int n = nextInt();
		int[] a = new int[n];
		for (int i=0; i<n; i++)
			a[i] = nextInt();
		Arrays.sort(a);
		int u = a[0];
		for (int i=0; i<n; i++)
			if (a[i]>u) {
				out.println(a[i]);
				out.flush();
				return;
			}
		out.println("NO");
		out.flush();
	}
}