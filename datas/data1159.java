public class Main{	public static void main(String[] args) throws Exception {
		new Thread(null, new Runnable() {
			public void run() {
				try {
					new C817().run();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}, "1", 1 << 26).start();
	}
}