public class Main{	public static void main(String[] args) throws Throwable {
		Thread thread = new Thread(null, new Solution(), "", (1 << 26));
		thread.start();
		thread.join();
		if (throwable != null) {
			throw throwable;
		}
	}
}