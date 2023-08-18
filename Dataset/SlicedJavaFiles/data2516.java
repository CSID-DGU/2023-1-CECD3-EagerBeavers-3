public class Main{	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new FileReader("F:/books/input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int n = Integer.parseInt(s);
		long[] a = new long[n];
		String[] as = br.readLine().split(" ");
		for(int i=0;i<n;i++) {
			a[i] = Long.parseLong(as[i]);
		}
		StringBuffer sb = solve(a,n);
		System.out.println(sb.toString());
	}
}