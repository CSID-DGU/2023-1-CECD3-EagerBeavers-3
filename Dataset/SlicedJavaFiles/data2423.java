public class Main{	public static void main(String[] args) throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		int n = nextInt();
		int[]a = new int[n+1];
		for (int i = 1; i <= n; i++) {
			a[i] = nextInt();
		}
		int inv = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j < i; j++) {
				if (a[j] > a[i])
					inv++;
			}
		}
		int m = nextInt();
		boolean odd = inv % 2==1;
		for (int i = 0; i < m; i++) {
			int left = nextInt();
			int right = nextInt();
			long k = right-left+1;
			if (k*(k-1)/2 % 2==1)
				odd = !odd;
			if (odd)
				pw.println("odd");
			else
				pw.println("even");
		}
		pw.close();
	}
}