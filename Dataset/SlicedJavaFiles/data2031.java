public class Main{	public static void main(String[] args) throws IOException {
		in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		out = new PrintWriter(System.out);

		int n = nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = nextInt();
		
		Arrays.sort(a);
		int f = a[0], q = 1;
		while (q < n && a[q] == f) q++;
		
		out.println(q < n ? a[q] : "NO");
		
		out.flush();
	}
}