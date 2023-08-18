public class Main{	public static void main(String[] args) throws Exception {
		boolean submit = true;		
		Scanner sc = submit ? new Scanner(System.in) : new Scanner(new File("A.in"));
		while(sc.hasNext()) {
			int n = sc.nextInt(), k = sc.nextInt();
			boolean p[] = sieveOfEratosthenes(1001);
			ArrayList<Integer> nolds = new ArrayList<Integer>();
					
			for(int i = 0, prev = 0; i < p.length; i++) {
				if(p[i]) {
					nolds.add(prev+i + 1);
					prev = i;
				}					
			}
			
			//System.out.println(nolds);
			
			int c = 0;
			for(int i : nolds)
				if(i >= 2 && i <= n && p[i])
					c++;
			
			System.out.println(c >= k ? "YES" : "NO");
			
		}
		
		
			
		
		

	}
}