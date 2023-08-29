public class Main{	public static void main(String[] args) {
		try {
			// begin reading inputs
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader reader = new BufferedReader(isr);

			// reading inputs
			int input = Integer.parseInt(reader.readLine());

			reader.close();
			isr.close();
			// end reading inputs

			boolean result = isAlmostLuckyNumber(input);
			System.out.println(result ? "YES" : "NO");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}