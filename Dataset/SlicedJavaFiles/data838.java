public class Main{	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt()-1;
		PrimeGen p = new PrimeGen(n);
		List<Integer> prims = new ArrayList<Integer>();
		for(int i = 2; i <= n; i++){
			if(p.isPrime(i)>0){
				prims.add(i);
			}
		}
		int sum = 0;
		for(int i = 0; i < prims.size() - 1; i++){
			int c = prims.get(i) + prims.get(i+1) + 1;
			if(c <= n && p.isPrime(c)>0){
				sum ++;
			}
		}
		System.out.println(sum>=k?"YES":"NO");
	}
}