public class Main{	public static void main(String[] args) throws Throwable {
		Thread t = new Thread(null, new Main(), "", 128 * 1024 * 1024);
		t.start();
		t.join();
		if (uncaught != null) {
			throw uncaught;
		}
	}
}