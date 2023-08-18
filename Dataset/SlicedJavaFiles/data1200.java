public class Main{	public static void main(String[] args) {
		MScanner sc = new MScanner();
		out = new PrintWriter(System.out);

		long N = sc.nextLong();
		long M = sc.nextLong();
		long K = sc.nextLong();
		
		if(M<=N-N/K)
			out.println(M);
		else{
			long ans = (fastModExpo(2,M-(N-N%K)/K*(K-1)-N%K+1,mod)-2)*K+M-(M-(N-N%K)/K*(K-1)-N%K)*K;
			out.println((mod+ans)%mod);
		}		
		out.close();
	}
}