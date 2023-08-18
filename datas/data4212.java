public class Main{	public static void main(String[] args) throws Exception {
		N = sc.nextInt();
		p = new double[N][N];
		for (int i = 0; i < N; ++i) {
			for (int j = 0; j < N; ++j) {
				p[i][j] = sc.nextDouble();
			}
		}
		double[] memo = new double[1 << N];
		memo[memo.length - 1] = 1;
		for (int i = N; i >= 2; --i) {
			int[] live = new int[N];
			for (int j = 0; j < i; ++j) {
				live[N - 1 - j] = 1;
			}
			do {
				int n = toInt(live);
				double norm = 2.0 / i / (i - 1);
				for (int f1 = 0; f1 < N; ++f1) {
					if (live[f1] == 0) continue;
					for (int f2 = f1 + 1; f2 < N; ++f2) {
						if (live[f2] == 0) continue;
						memo[n - (1 << f1)] += memo[n] * p[f2][f1] * norm;
						memo[n - (1 << f2)] += memo[n] * p[f1][f2] * norm;
					}
				}
			} while (nextPermutation(live));
			//			System.out.println(Arrays.toString(memo));
		}
		for (int i = 0; i < N; ++i) {
			System.out.print(format.format(memo[1 << i]));
			if (i < N - 1) {
				System.out.print(" ");
			}
		}
	}
}