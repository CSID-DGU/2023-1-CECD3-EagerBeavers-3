public class Main{    public static void main(String[] args) {
	InputReader in = new InputReader (System.in);
	PrintWriter out = new PrintWriter (System.out);

	int n = in.nextInt();
	int s = in.nextInt();
	int deg[] = new int [n];
	
	for (int i = 1; i < n; ++i) {
	    deg[in.nextInt() - 1] ++;
	    deg[in.nextInt() - 1] ++;
	}

	int l = 0;
	for (int i = 0; i < n; ++i)
	    if (deg[i] == 1) l ++;

	out.println((double) 2 * s / l);
	out.close();
    }
}