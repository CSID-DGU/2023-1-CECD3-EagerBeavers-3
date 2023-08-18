public class Main{	public static void main(String[] args) throws Exception {
		int n = nextInt();
		int[] c = new int[2];
		int[] f = new int[2];
		for (int i = 0; i < n; i++) {
			int x = nextInt(), p = x%2;
			if (c[p]++ == 0) f[p] = i+1;
		}
		out.println(c[0] == 1 ? f[0] : f[1]);
		
		out.flush();
	}
}