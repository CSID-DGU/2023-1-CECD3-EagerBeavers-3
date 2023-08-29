public class Main{	public static void main(String[] args) throws IOException {
		BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);

		String[] data = s.readLine().split(" ");
		double a = Double.valueOf(data[0]);
		double v = Double.valueOf(data[1]);
		
		String[] line = s.readLine().split(" ");
		double l = Double.valueOf(line[0]);
		double d = Double.valueOf(line[1]);
		double w = Double.valueOf(line[2]);

		double ans = solve(a, v, l, d, w);
		out.println(String.format("%.07f", ans));
		
		out.flush();
	}
}