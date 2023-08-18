public class Main{	public static void main(String[] args) throws IOException {
		BufferedReader _br = new BufferedReader(new FileReader(new File("input.txt")));
		PrintWriter _pw = new PrintWriter(new FileWriter(new File("output.txt")));
		new C(_br, _pw).run();
		_br.close();
		_pw.close();
	}
}