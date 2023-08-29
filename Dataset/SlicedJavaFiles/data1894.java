public class Main{	public static void main(String[] args) throws Throwable {

		if (test) { // run all cases from testfile:
			BufferedReader testdataReader = new BufferedReader(new FileReader(testDataFile));
			String readLine = testdataReader.readLine();
			int casenr = 0;
			out: while (true) {
				BufferedWriter w = new BufferedWriter(new FileWriter(feedFile));
				if (!readLine.equals("input")) {
					break;
				}
				while (true) {
					readLine = testdataReader.readLine();
					if (readLine.equals("output")) {
						break;
					}
					w.write(readLine + "\n");
				}
				w.close();
				System.out.println("Answer on case " + (++casenr) + ": ");

				new A111_div2().solve();
				System.out.println("Expected answer: ");

				while (true) {
					readLine = testdataReader.readLine();

					if (readLine == null) {
						break out;
					}
					if (readLine.equals("input")) {
						break;
					}
					System.out.println(readLine);
				}
				System.out.println("----------------");
			}
			testdataReader.close();
		} else { // run on server
			new A111_div2().solve();
		}
		out.close();
	}
}