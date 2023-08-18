public class Main{	public static void main(String args[]) throws IOException
		{
		BufferedReader c=new BufferedReader(new InputStreamReader(System.in));
		String S[]=c.readLine().split(" ");
		int N=Integer.parseInt(S[0]);
		int K=Integer.parseInt(S[1]);
		int A[]=parseArray(c.readLine(),N);
		shuffle(A);
		Arrays.sort(A);
		
		TreeMap<Long,Long> T=new TreeMap<Long, Long>();
		int ans=0;
		for(int i=0;i<N;i++)
			T.put((long)A[i],1L);
		//System.out.println(Arrays.toString(A));
		if(K==1)
			{
			System.out.println(N);
			return;
			}
		else
			{
			for(int i=0;i<N;i++)
				{
				if(A[i]%K==0&&T.containsKey((long)A[i]/K))		//A[i] is not start of a chain
					continue;
				//System.out.println("considering "+A[i]);
				int chainSize=0;
				long init=A[i];
				while(T.containsKey(init))
					{
					chainSize++;
					init=init*K;
					}
				//System.out.println("\t"+chainSize);
				ans+=(chainSize+1)/2;
				}
			}
		System.out.println(ans);
		}
}