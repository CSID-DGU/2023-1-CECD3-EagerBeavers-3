public class Main{	public static void main(String[] args) throws Throwable {
		Thread t = new Thread(null, new Solution(), "", (1 << 26));
		t.start();
		t.join();
		if (uncaught != null) {
			throw uncaught;
		}
	}
}