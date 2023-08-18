public class Main{	public static void main(String[] args) throws IOException {
		is = System.in;
		int n = ni();
		int k = ni();
		
		int[][] aj = new int[n][n];
		
		for (int i = 0; i < aj.length; i++) {
			aj[i] = na(n);
		}
		
		int F = (n+1)/2;
		int B = n-F;
		
		int[] spanftf = new int[F];
		int[] spanftb = new int[F];
		for(int i =0; i < F; i++){
			for(int j =0; j < F; j++){
				if(i == j || aj[i][j] == 1){
					spanftf[i] |= 1<<j;
				}
			}
			for(int j =0; j< B; j++){
				if(aj[i][F+j] == 1){
					spanftb[i] |= 1<<j;
				}
			}
		}
		int[] maxes = new int[1<<B];
		for(int bm = 0; bm < (1<<F); bm++){
			int anded = (1<<F)-1;
			int spanToBack = (1<<B)-1;
			
			for(int i =0; i < F; i++){
				if((1<<i & bm) != 0){
					anded &= spanftf[i];
					spanToBack &= spanftb[i];
				}
			}
			
			if((anded & bm) == bm){
				maxes[spanToBack] = Math.max(maxes[spanToBack], Integer.bitCount(bm));
			}
		}
		int[] spanbtb = new int[B];
		for(int i =0; i < B; i++){
			for(int j =0; j< B; j++){
				if(aj[F+i][F+j] == 1 || i == j){
					spanbtb[i] |= 1<<j;
				}
			}
		}
		boolean[] isgood = new boolean[1<<B];
		for(int bm =0; bm < (1<<B); bm++){
			int anded = (1<<B)-1;
			
			for(int i =0; i < B; i++){
				if((1<<i & bm) != 0){
					anded &= spanbtb[i];
				}
			}
			
			if((anded & bm) == bm){
				isgood[bm] = true;
			}
			
		}
		bybc[] tosort = new bybc[1<<B];
		for (int i = 0; i < tosort.length; i++) {
			tosort[i]= new bybc(i);
		}
		Arrays.sort(tosort);
		
		int best = 1;
		for (int i = 0; i < tosort.length; i++) {
			int at  =tosort[i].mask;
			if(isgood[at]){
				best = Math.max(best, maxes[at]+Integer.bitCount(at));
			}
			
			for(int j =0; j < B; j++){
				if((1<<j & at) != 0){
					int to = at - (1<<j);
					maxes[to] = Math.max(maxes[to], maxes[at]);
				}
			}
			
		}
		
		//System.out.println("best: " + best);
		
		double ans= best*(best-1)/2.0 * (k*k/(double)(best*best));
		System.out.println(ans);
	}
}