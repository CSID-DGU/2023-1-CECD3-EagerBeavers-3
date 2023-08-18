public class Main{	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] dat = br.readLine().split(" ");

		int n = Integer.parseInt(dat[0]);
		int T = Integer.parseInt(dat[1]);

		int[] st = new int[n];
		byte[] sg = new byte[n];

		dp = new int[1 << (n + 1)][4];

		for (int j = 0; j < 1 << (n + 1); j++) {
			for (int k = 0; k < 4; k++) {
				dp[j][k] = -1;
			}
		}

		for (int i = 0; i < n; i++) {
			dat = br.readLine().split(" ");
			st[i] = Integer.parseInt(dat[0]);
			sg[i] = Byte.parseByte(dat[1]);
		}

		short visited = 0;

		int count = recur(0, visited, st, sg, T, 0);

		bw.write(count + "\n");

		bw.close();

	}
}