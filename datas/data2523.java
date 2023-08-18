public class Main{    public static void main(String[] args) throws Exception {
	try {
	    fastReader = new FastReader(System.in);
	    systemOut = new BufferedOutputStream(System.out);
	    solve();
	} finally {
	    systemOut.close();
	}
    }
}