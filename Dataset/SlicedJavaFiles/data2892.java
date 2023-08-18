public class Main{	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Solution sol = new Solution();
		final boolean CONTEST = true;
		if (CONTEST) {
			sol.cin = new BufferedReader(new InputStreamReader(System.in));
			sol.cout = new PrintWriter(System.out);

		} else {
			sol.cin = new BufferedReader(new FileReader("input.txt"));
			sol.cout = new PrintWriter("output.txt");
		}
		sol.solve();
		sol.cin.close();
		sol.cout.close();
	}
}