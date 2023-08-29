public class Main{	public static void main(String[] args) {
		Scanner r = new Scanner(System.in);
		
		long N = r.nextLong();
		long X = r.nextLong();
		long Y = r.nextLong();
		long C = r.nextLong();
		
		long lo = 0, hi = N * 2;
		
		while(lo < hi){
			long T = (lo + hi) / 2;
			
			long[] NX = new long[4];
			long[] NY = new long[4];
			
			for(int d = 0; d < 4; d++){
				NX[d] = X + dx[d] * T;
				NY[d] = Y + dy[d] * T;
			}
			
			long ret = (T + 1) * (T + 1) + T * T;
			
			ret -= half(1 - NY[0]);
			ret -= half(NY[2] - N);
			ret -= half(NX[1] - N);
			ret -= half(1 - NX[3]);
			
			ret += quarter(1 - NY[0] - (N - X + 1));
			ret += quarter(1 - NY[0] - (X));
			ret += quarter(NY[2] - N - (N - X + 1));
			ret += quarter(NY[2] - N - (X));
			
			if(ret < C)lo = T + 1;
			else hi = T;
		}
		
		System.out.println(lo);
		
	}
}