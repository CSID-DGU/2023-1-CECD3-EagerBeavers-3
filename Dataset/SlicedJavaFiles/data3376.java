public class Main{	public static void main(String args[]) throws Exception {
		OverlapedString os = new OverlapedString();
		BufferedReader stdin =
			new BufferedReader(new InputStreamReader(System.in));
		String line;
		while ((line = stdin.readLine()) != null) {
			System.out.println(os.handleOverlap(line));
		}
	}
}