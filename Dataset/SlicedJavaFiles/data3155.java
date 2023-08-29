public class Main{ 	public static void main(String[] args) throws Exception {
 		if ("Satayev".equals(System.getProperty("user.name"))) {
			long start = System.nanoTime();
			new trafficerules().solve(new FileInputStream("input"));
			System.err.printf("Time elapsed: %d ms.\n", (System.nanoTime()-start)/1000000);
		}
		else
			new trafficerules().solve(System.in);
 	}
}