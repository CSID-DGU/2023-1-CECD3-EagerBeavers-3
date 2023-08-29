public class Main{	public static void main(String[] args) throws FileNotFoundException{
		
		// Input from file
		// File inputFile = new File("JavaFile.txt");
		// File outputFile = new File("JavaOutputFile.txt");
		// FileReader fileReader = new FileReader(inputFile);
		// Here it ends
			
		MyScanner sc = new MyScanner();
		// MyScanner sc = new MyScanner(fileReader);
		
		out = new PrintWriter(new BufferedOutputStream(System.out)); // Output to console
		// out = new PrintWriter(new PrintStream(outputFile)); // Output to file
		
		getAns(sc);
		
		out.close();
	}
}