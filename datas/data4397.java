public class Main{	public static void main(String[] args) throws InterruptedException {
		 new Thread(null, new Runnable() {
            public void run() {
                new Main().run();
            }
	     }, 
	     "1", 
	     1 << 25).start();
	}
}