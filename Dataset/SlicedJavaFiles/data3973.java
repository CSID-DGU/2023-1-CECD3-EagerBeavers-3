public class Main{	public static void main(String[] args) throws IOException {
		try {
			if (new File("input.txt").exists())
				System.setIn(new FileInputStream("input.txt"));
		} catch (SecurityException e) {
		}
		new Thread(null, new Runnable() {
			public void run() {
				try {
					new Main().run();
				} catch (Throwable e) {
					e.printStackTrace();
					exit(999);
				}
			}
		}, "1", 1 << 23).start();
	}
}