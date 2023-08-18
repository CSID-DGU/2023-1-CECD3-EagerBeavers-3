public class Main{	public static void main(String[] args) {
		new Thread(null, new A(), "", 256 * 1024 * 1024).start();
	}
}