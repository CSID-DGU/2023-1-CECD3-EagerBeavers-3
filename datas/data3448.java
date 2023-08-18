public class Main{    public static void main(final String[] args) {
	try {

	    solve();
	    if (file) {
		System.out.flush();
	    }
	    if (!file) {
		out.flush();
	    }

	} finally {
	    in.close();
	    out.close();
	}
    }
}