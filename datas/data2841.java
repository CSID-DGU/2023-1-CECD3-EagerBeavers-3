public class Main{	public static void main(String[] args) {
		new Thread(null, new A483(), "", 256 * (1L << 20)).start();
	}
}