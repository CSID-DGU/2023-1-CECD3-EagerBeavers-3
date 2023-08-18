public class Main{	public static void main(String[] args) {

		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		
		int n = in.nextInt();
		int m = in.nextInt();
		int[][] a = new int[n][m];
		int[][] graphVerticial = null;
		int[][] graphDiagonal = null;
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				a[i][j] = in.nextInt();
			}
		}
		
		graphVerticial = createGraphVertical(n, m, a);
		graphDiagonal = createGraphDiagonal(n, m, a);
		
//		print(graphVerticial);
//		System.out.println("##########################");
//		print(graphDiagonal);
		
		int result = 0;
		int k = 1;
		int piso = 0;
		int teto = 1000000000;
		
		while(true) {
			
			k = (int) Math.ceil((teto - piso) / 2.0) + piso;
			
			if(isOk(n, k, graphVerticial, graphDiagonal)) {
				result = Math.max(result, k);
				piso = k;
			}
			else{
				teto = k - 1;
			}

			//System.out.println(piso + ", " + teto);
			
			if(teto <= piso) break;
			
		}
		
		System.out.println(result);
		
	}
}