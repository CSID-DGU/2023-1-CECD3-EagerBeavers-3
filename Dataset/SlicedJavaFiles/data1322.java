public class Main{	public static void main(String[] args) {
		FastScanner in = new FastScanner();
	    
		long x = in.nextLong(), k = in.nextLong();
		
		long mod = 1000000007;
		
		long one = pow(2,k,mod);
		
		one %= mod;
		
		long two = (2*x)%mod-1;
		
		two %= mod;
		
		long ans = (one*two)%mod+1;
		
		ans %= mod;
		
		if(ans<0)
			ans += mod;
		
		if(x==0)
			System.out.println("0");
		else
			System.out.println(ans);
	        
	}
}