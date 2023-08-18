public class Main{	public static void main(String[] args) throws Exception {

		FastScanner sc = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		
		int h = sc.nexI();
		int w = sc.nexI();
		int k = sc.nexI();
		
		
		Graph grid = new Graph(h*w);
		
		for(int i=0; i<h; i++) {
			for(int j=1; j<w; j++) {
				long w1 = sc.nexL();
				grid.add2(getad(w, i, j-1), getad(w, i, j), w1);
			}
		}
		for(int i=1; i<h; i++) {
			for(int j=0; j<w; j++) {
				long w1 = sc.nexL();
				grid.add2(getad(w, i-1, j), getad(w, i, j), w1);
			}
		}
		
		if(k%2 != 0) {
			int[][] anss = new int[h][w];
			fill(anss,-1);
			for(int i=0; i<h; i++) {
				prtspas(anss[i]);
			}
			
			return;
		}
		if((h*w) == 1) {
			System.out.println(-1);
			return;
		}
		
		long[][] mincos = new long[(k/2)+1][h*w];
		fill(mincos[0],0L);
		
		for(int t=1; t<=(k/2); t++) {
			fill(mincos[t], INFL);
			for(int i=0; i<h; i++) {
				for(int j=0; j<w; j++) {
					int ad = getad(w, i, j);
					for(Edge e: grid.get(ad)) {
						mincos[t][ad] = min(mincos[t][ad], mincos[t-1][e.v2]+e.w);
					}
				}
			}
		}
		
		
		for(int i=0; i<(h*w); i++) {
			mincos[k/2][i]*=2L;
		}
		for(int i=0; i<h; i++) {
			prtspas(Arrays.copyOfRange(mincos[k/2], i*w, i*w + w));
		}
		
		out.flush();
		return;
	}
}