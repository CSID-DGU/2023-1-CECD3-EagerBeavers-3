public class Main{	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());

		long[] a = new long[n];

		for (int i = 0; i < a.length; i++) {
			a[i] = Long.parseLong(st.nextToken());
		}

		long[] sum = new long[n];
		sum[0] = a[0];
		for (int i = 1; i < sum.length; i++) {
			sum[i] = sum[i - 1] + a[i];
		}

		solve(a, sum);

	}
}