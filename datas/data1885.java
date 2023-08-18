public class Main{	public static void main(String[] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		
		BigInteger ans = BigInteger.ZERO;
		int n = sc.nextInt();
		int arr[] = new int[n];
		long cum[] = new long[n];
		
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		
//		int n=(int)2e5;
//		for(int i=0;i<n;i++){
//			arr[i]=1;
//			if(i>n/2)
//				arr[i]=(int)1e9;
//		}
		
		for (int i = 0; i < cum.length; i++)
		{
			cum[i] = arr[i];
			if(i > 0)
				cum[i] += cum[i-1];
		}
		
		for (int i = 0; i < n; i++)
			ans = ans.add(BigInteger.valueOf((1l*(i+1)*arr[i] - cum[i])));
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < n; i++)
		{
			ans =  ans.subtract(BigInteger.valueOf(map.getOrDefault(arr[i]-1, 0)));
			ans = ans.add(BigInteger.valueOf(map.getOrDefault(arr[i]+1, 0)));
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
		}
		
		pw.println(ans);
		pw.flush();
		pw.close();
	}
}