public class Main{	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter printer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer inputData = new StringTokenizer(reader.readLine());
		long st = Long.parseLong(inputData.nextToken());
		if(st == 0) {
			printer.println(0);
			printer.close();
			return;
		}
		st %= MOD;
		long years = Long.parseLong(inputData.nextToken());
		long[][] res = exp(years);
		long ans = (res[0][0] * st % MOD * 2 % MOD + res[0][1] * (-1 + MOD) % MOD) % MOD;
		printer.println(ans);
		printer.close();
	}
}