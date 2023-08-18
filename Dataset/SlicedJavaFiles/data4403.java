public class Main{	public static void main(String[] args) {
		InputStream input;
		OutputStream output;
		try {
			input = new FileInputStream("input.txt");
			output = new FileOutputStream("output.txt");
		} catch (FileNotFoundException e) {
			input = System.in;
			output = System.out;
		}
		Kattio io = new Kattio(input, output);
		(new Solve(io)).main();
		io.close();

		if (input instanceof FileInputStream)
			try {
				input.close();
			} catch (IOException e) {

			}
		if (output instanceof FileOutputStream)
			try {
				output.close();
			} catch (IOException e) {

			}
	}
}