public class Main{	public static void main(String[] args) throws IOException {
		new Thread(null, new Runnable() {
			public void run() {
				try {
					long prevTime = System.currentTimeMillis();
					new Main().run();
					System.err.println("Total time: "
							+ (System.currentTimeMillis() - prevTime) + " ms");
					System.err.println("Memory status: " + memoryStatus());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}, "1", 1L << 24).start();
	}
}