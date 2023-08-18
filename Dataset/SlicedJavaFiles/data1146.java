public class Main{	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] in = br.readLine().split(" ");
		long n = Long.parseLong(in[0]), s = Long.parseLong(in[1]);
		Solver solver = new Solver(n, s);
		System.out.println(solver.solve());

	}
}