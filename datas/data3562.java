public class Main{				public static void main(String[] args) throws Exception {
			    	new Thread(null, new Runnable() {
						public void run() {
							try {
				soln();
						} catch (Exception e) {
								System.out.println(e);
							}
						}
					}, "1", 1 << 26).start();
					
				}
}