public class Main{	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		Locale.setDefault(Locale.US);
		new A().run();
		System.err.printf("%.3f\n", 1e-3 * (System.currentTimeMillis() - time));
	}
}