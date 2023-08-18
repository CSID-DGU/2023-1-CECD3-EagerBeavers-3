public class Main{	public static void main(String[] args) throws Exception {

		STDIN scan = new STDIN();
		PrintWriter pw = new PrintWriter(System.out);
		
		int n = scan.nextInt();
		boolean even = true;
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
			for(int j = 0; j < i; j++)
				if(a[i] < a[j]) even = !even;
		}
		int q = scan.nextInt();
		while(q-- > 0) {
			int l = scan.nextInt(), r = scan.nextInt();
			int len = r - l + 1;
			int permutations = len * (len - 1) / 2;
			if(permutations % 2 != 0) even = !even;
			pw.println(even ? "even" : "odd");
		}
		
		pw.flush();
	}
}