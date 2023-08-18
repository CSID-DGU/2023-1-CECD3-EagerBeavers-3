public class Main{	public static void main(String[] args) {
		n = ini();
		m = ini();
		k = ini();
		
		if (k%2!=0) {
			for(int i=0; i<n; i++) {
				for(int j=0; j<m; j++) {
					print(-1+" ");
				}
				println();
			}
			out.flush();
			return;
		}

		hor = new int[n][m-1];
		ver = new int[n-1][m];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m-1; j++) {
				hor[i][j] = ini();
			}
		}
		for(int i=0; i<n-1; i++) {
			for(int j=0; j<m; j++) {
				ver[i][j] = ini();
			}
		}
		
		dp = new Integer[n][m][k+1];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				print(2*solve(i, j, k/2)+" ");
			}
			println();
		}
		
		out.flush();
		out.close();

	}
}