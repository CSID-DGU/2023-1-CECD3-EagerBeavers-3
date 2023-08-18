public class Main{	public static void main(String[] args) throws Exception {
		FastIO sc = new FastIO(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		long remove = 0;
		
		int[] heights = new int[n+1];
		
		for(int i = 0; i < n; i++) {
			heights[i] = sc.nextInt();
			remove += heights[i];
		}
		
		Arrays.sort(heights);
		//System.out.println(Arrays.toString(heights));
		long keep = 0;
		for(int i = n; i> 0; i--) {
			if(heights[i-1] >= heights[i]) {
				heights[i-1] = heights[i]-1;
			}
			keep += heights[i] - heights[i-1];
		}
		//System.out.println(Arrays.toString(heights));
		
		pw.println(remove - keep);
		pw.close();
	}
}