public class Main{	public static void main(String[] args) throws NumberFormatException, IOException {
		in = new BufferedReader(new InputStreamReader(System.in));
		st = new StringTokenizer("");
		out = new PrintWriter(new OutputStreamWriter(System.out));
		int n = nextInt();
		int k = nextInt();
		int [] a = new int [n];
		for (int i = 0; i < n; i++) {
			a[i] = nextInt();
		}
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			set.add(a[i]);
			if(set.size()==k){
				Set<Integer> set2 = new HashSet<Integer>();
				for (int j = i; j >= 0; j--) {
					set2.add(a[j]);
					if(set2.size()==k){
						out.print((j+1)+" "+(i+1));
						out.close();
						return;
					}
				}
			}
		}
		out.print("-1 -1");		
		out.close();
	}
}