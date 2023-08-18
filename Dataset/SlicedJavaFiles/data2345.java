public class Main{	public static void main(String[] args) {
		new Thread(null, new Main(), "persefone", 1 << 28).start();
	}
}