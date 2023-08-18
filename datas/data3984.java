public class Main{	public static void main(String[] args) {
		try {
			in = new BufferedReader(new InputStreamReader(System.in));
			out = new PrintWriter(System.out);

			// debug(solve(1, 4));
			// debug(solve(6, 6));

			// debug(solve(7,5) == solve(5,7));
//			PrintWriter out2 = new PrintWriter("file.txt");
//			//
			cache = new int[41][41];
			fill();
//			//
//			for (int i = 1; i <= 40; i++) {
//				for (int j = 1; j <= i; j++) {
//					if (i * j <= 40) {
//						int k = solve(i, j);
//						out2.printf("cache[%d][%d] = %d;\n", i, j, k);
//						out2.printf("cache[%d][%d] = %d;\n", j, i, k);
//
//						cache[i][j] = solve(i, j);
//						debug(i + " " + j);
//					}
//				}
//			}
//			out2.close();

			 int n = nextInt();
			 int m = nextInt();
			 //int res = solve(n, m);
			 out.println(cache[n][m]);

			// for (int i = 1; i <= 5; i++) {
			// for (int j = 1; j <= 5; j++) {
			// assert(solve(i, j) == cache[i][j]);
			// //debug(i + " " + j + " " + solve(i, j));
			// }
			// }

			out.close();
		} catch (Throwable e) {
			e.printStackTrace();
			System.exit(1);
		}
	}
}