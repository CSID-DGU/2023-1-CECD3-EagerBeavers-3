public class Main{	public static void main(String args[]) throws Exception {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		int n = i(r.readLine());
		boolean i = solve("7", n);
		boolean j = solve("4", n);
		if(i || j){
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}