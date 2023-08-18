public class Main{	public static void main(String[] args) throws IOException {
		try {
			if (new File("input.txt").exists())
				System.setIn(new FileInputStream("input.txt"));
		} catch (SecurityException e) {
		}
		new Thread() {
			public void run() {
				try {
					new Main().run();
				} catch (IOException e) {
				}
			}
		}.start();
	}
}