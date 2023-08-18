public class Main{	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long s  = sc.nextLong();
		
		long m = s;
		
		while(m-digitAdd(m)<s && m<=n){
			m++;
		}
		System.out.println(Math.max(n-m+1, 0));
	}
}