public class Main{	public static void main(String[] args) throws Exception{
		Thread t = new Thread(null, null, "~", Runtime.getRuntime().maxMemory()){
			@Override
			public void run(){
				try {
					solve();
				} catch(Exception e) {
					System.err.println("ERROR");
				}
			}
		};

		t.start();
		t.join();	
	}
}