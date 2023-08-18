public class Main{	public static void main(String[] args) 
	{ 
        FastReader sc = new FastReader(); 
        //PrintWriter out = new PrintWriter(System.out); 
        int n = sc.nextInt();
		int k = sc.nextInt();
		long one = (long)Math.pow(2, k) - 1;
		
		long[] arr = new long[n+1];
		
		arr[0] = 0;
		for(int i=1;i<=n;i++){
			arr[i] = sc.nextLong();
			arr[i] ^= arr[i-1];
		}

		Map<Long, Long> count = new HashMap<>();

		for(int i=0;i<=n;i++){
			Long key = Math.min(arr[i], (arr[i]^one));
			Long val = count.get(key);
			if(val==null) val = 0L;
			count.put(key, val+1);
		}

		long num = n;
		long ans = num*(num+1)/2;
		
		for(Map.Entry<Long, Long> ent: count.entrySet()){
			
			Long cnt = ent.getValue();
			
			long num1 = cnt/2;
			long num2 = (cnt+1)/2;
			
			ans -= ( (num1*(num1-1))/2 );
			ans -= ( (num2*(num2-1))/2 );
		}

		System.out.println(ans);
	}
}