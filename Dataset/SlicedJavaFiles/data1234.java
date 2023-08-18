public class Main{	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
		long n = reader.nextInt();
		long m = reader.nextInt();
		long k = reader.nextInt();
		
		long r = (n + k - 1)/k;
		
		long longDrops = n%k;
		
		if(longDrops == 0){
			long d = m - (r * (k-1));
			
			if(d <= 0){
				System.out.println(m);
				return;
			}
			
			long sum = (fastExpo(2,d+1)-2) * k + (m - d*k);
			System.out.println((sum+MOD)%MOD);
		}else{
			long d = (m-longDrops*r) - (r-1)*(k-longDrops-1);
			
			if(d <= 0){
				System.out.println(m);
				return;
			}
			
			long sum = (fastExpo(2,d+1)-2) * k + (m - d*k);
			System.out.println((sum+MOD)%MOD);
		}
	}
}