public class Main{	public static void main(String[] args) throws Exception {
		in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		out = new PrintWriter(System.out);
		
		int n = nextInt(), t = nextInt() * 2;
		int[][] a = new int[n][2];
		for (int i=0; i<n; i++) {
			a[i][0] = nextInt() * 2;
			a[i][1] = nextInt() * 2;
		}
		
		Arrays.sort(a, new Comparator<int[]>() {
			public int compare(int[] a, int[] b) {
				return a[0]>b[0]?1:a[1]<b[1]?-1:0;
			}
		});
		
		int s = 2;
		
		for (int i=0; i<n-1; i++) {
			int g = (a[i+1][0]-a[i][0])-(a[i+1][1]+a[i][1])/2;
			if (g > t) s += 2;
			if (g == t) s+= 1;
		}
		out.println(s);
		
		
		out.flush();
	}
}