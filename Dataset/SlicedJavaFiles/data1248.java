public class Main{	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		long n=scan.nextLong(), k=scan.nextLong();
		if(n==0) {
			System.out.println(0);
			return;
		}
		long x=2*n-1;
		long e=exp(2,k);
		System.out.println((x%MOD*e%MOD+1)%MOD);
	}
}