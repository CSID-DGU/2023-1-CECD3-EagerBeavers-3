public class Main{	public static void main(String[] args) throws FileNotFoundException {
		if (_READ_FROM_FILE)
			System.setIn(new FileInputStream("in.in"));
		in = new Scanner(System.in);
		core();
	}
}