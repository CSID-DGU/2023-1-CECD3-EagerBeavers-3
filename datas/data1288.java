public class Main{	public static void main(String[] args) throws IOException, InterruptedException {
		Scanner sc =  new Scanner(System.in) ;

		long x = sc.nextLong() ; 
		long k = sc.nextLong() ; 
		if(x==0)
		{System.out.println(0); return ;}
		if(k==0)
		{System.out.println((2l*x)%mod);return ;}	


		long m=pow(2,k);


		long a = 2l*(x%mod)*(m%mod);


		a = a-m+1 ;

		a=a%mod ; 
		if(a<0)a=(a%mod + mod) % mod;

		System.out.println(a);





	}
}