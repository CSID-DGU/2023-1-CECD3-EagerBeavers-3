public class Main{public static void main (String[] args) throws java.lang.Exception {		
	long startTime = System.currentTimeMillis();

	out = new PrintWriter(System.out);
	solve();	
	//out.println((String.format("%.2f",(double)(System.currentTimeMillis()-startTime)/1000)));
	out.close();
}
}