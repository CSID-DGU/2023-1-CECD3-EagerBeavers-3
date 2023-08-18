public class Main{	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 int n = scanner.nextInt();
		 
		 List<Integer> as = new LinkedList<>();
		 int[] as2 = new int[n];
		 
		 for (int i = 0; i < n; i++) {
			 int a = scanner.nextInt();
			 as.add(a);
			 as2[i] = a;
		 }
		 
		 //System.out.println(solve(as));
		 System.out.println(solve2(as2));
		
		scanner.close();
	}
}