public class Main{	public static void main(String[] args) {
		if (LOCAL) {
			try {
				System.setIn(new FileInputStream("./../../in.txt"));
				// System.setOut(new PrintStream("./../../out"));
			} catch (Throwable e) {
				LOCAL = false;
			}
		}
		long start = 0;
		if (LOCAL)
			start = System.nanoTime();
		new Main().run();
		if (LOCAL)
			System.err.printf("[Time : %.6f s]%n",
					(System.nanoTime() - start) * 1e-9);
	}
}