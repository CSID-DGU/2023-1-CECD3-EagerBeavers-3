public class Main{	public static void main(String[] args) {
		new Thread(null, new B(), "Main", 1 << 26).start();
	}
}