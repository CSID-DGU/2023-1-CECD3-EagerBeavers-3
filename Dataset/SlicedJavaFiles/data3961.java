public class Main{	public static void main(String[] args) {new Thread(null, new Runnable() { public void run() {try {
		sol();
	} catch (Throwable e) {

		e.printStackTrace();
	}}}, "2",1<<26).start();}
}