public class Main{	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());
		
		long x = Long.parseLong(st.nextToken());
		if(x == 0){
			System.out.println(0);
			System.exit(0);
		}
		final long k = Long.parseLong(st.nextToken());	
		x = x%M;
		
		long ans = (exp(2, k+1)*x - (exp(2, k) - 1))%M;
		if(ans < 0) ans += M;
		System.out.println(ans);
		/*
		for(long i = 1234567890; i < 1234567999; i++){
			ans = (exp(2, i+1)*x - (exp(2, i) - 1))%M;
			if(ans < 0) ans += M;
			System.out.println(ans);
		}
		/*
		System.out.println((k-1)/2);
		System.out.println(x);
		System.out.println(exp(2, k));
		System.out.println(exp(2, k+1));
		*/
	}
}