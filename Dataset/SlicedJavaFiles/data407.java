public class Main{	public static void main(String[] args){
		new Thread(null, new B(), "", 128 * (1L << 20)).start();
	}
}