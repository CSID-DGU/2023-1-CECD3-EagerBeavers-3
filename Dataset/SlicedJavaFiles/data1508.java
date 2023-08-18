public class Main{	public static void main(String[] args) throws IOException {
		in = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintWriter(System.out);

		boolean showLineError = true;
		if (showLineError) {
			solve();
			out.close();
		} else {
			try {
				solve();
			} catch (Exception e) {
			} finally {
				out.close();
			}
		}

	}
}