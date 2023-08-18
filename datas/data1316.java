public class Main{	public static void main(String[] args) {
		JS in = new JS();
		x = in.nextLong();
		k = in.nextLong();
		
		if(x==0) {
			System.out.println(0);
			return;
		}
		
		long c = pow(2,k);
		if(c==0) c = mod;
		long sub = c-1;
		
		long low = ((c*(x%mod))%mod - sub);
		while(low < 0) low += mod;
		long res = ((low*2)%mod + sub)%mod;
		
		System.out.println(res);
		
		
	}
}