public class Main{	public static void main(String[] args) throws Exception {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(r.readLine());

		int[] ar = new int[n];
		StringTokenizer st = new StringTokenizer(r.readLine());
		for (int x = 0; x < n; x++) {
			ar[x] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(ar);
		if (n == 1) {

			System.out.println(ar[0]==1?"2":"1");
			return;
		}
		if (ar[n - 1] == 1) {
			ar[n - 2] = 2;
		}
		System.out.print("1");
		for (int x = 0; x < n - 1; x++) {
			System.out.print(" " + ar[x]);
		}
		System.out.println();
	}
}