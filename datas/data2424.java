public class Main{	public static void main(String args[]) throws IOException {
		FastScanner in = new FastScanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		//BEGIN HERE
		int n = in.nextInt();
		int perm[] = new int[n];
		for(int i  = 0; i < n; i++) {
			perm[i] = in.nextInt();
		}
		int q = in.nextInt();
		
		int inv[] = new int[n];
		inv[0] = 0;
		for(int i = 1; i < n; i++) {
			inv[i] = inv[i-1];
			for(int j = i - 1; j >= 0; j--) {
				if(perm[i] < perm[j]) inv[i]++;
			}
		}
		boolean parity = inv[n-1] % 2 == 0;
		
		for(int i = 0; i < q; i++) {
			int l = in.nextInt() - 1;
			int r = in.nextInt() -1; 
			if(l == r) {
				System.out.println(parity?"even":"odd");
				continue;
			}

			int s = r - l + 1;
			s = s * (s-1)/ 2;
			if(s % 2 != 0) {
				parity = !parity;
			}
			System.out.println(parity?"even":"odd");
		}
		out.close();
	}
}