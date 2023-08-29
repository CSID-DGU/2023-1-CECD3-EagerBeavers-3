public class Main{	public static void main(String[] args) throws IOException {
		// BufferedReader bin = new BufferedReader(new FileReader("cactus.in"));
		BufferedReader bin = new BufferedReader(
				new InputStreamReader(System.in));
		SportMafia l = new SportMafia();
		l.readData(bin);
		l.calculate();
		l.printRes();
	}
}