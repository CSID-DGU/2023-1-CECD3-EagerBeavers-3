public class Main{	public static void main(String[] args) {
		final boolean oldChecker = false;
		
		if(oldChecker) {
			new Thread(null, new C(), "yarrr", 1 << 24).start();
		} else {
			new C().run();
		}
	}
}