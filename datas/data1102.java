public class Main{	public static void main(String[] args) {
		in = new FS();
		if(!debug) N = in.nextInt();
		else N = inp.length;
		int x = solve(0, N/2-1, N/2, N-1);
		out.println("! "+(x+1));
		out.flush();
		out.close();
	}
}