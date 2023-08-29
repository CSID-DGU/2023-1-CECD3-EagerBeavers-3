public class Main{	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int n = sc.nextInt();
		int d =sc.nextInt();
		int[] hotels = new int[n];
		for (int i = 0; i < hotels.length; i++) {
			hotels[i] = sc.nextInt();
		}
		int count = 0;
		for (int i = 0; i < hotels.length-1; i++) {
			int one = hotels[i];
			int two = hotels[i+1];
			double mid = (two-one)*1.0/2.0;
			if(mid==d) {
				count++;
//				System.out.println("hello"+" "+i+" "+(i+1));
			}
			else if(mid>d) {
//				System.out.println("hello2"+" "+i+" "+(i+1));
				count+=2;
				
			}
			
		}
		count+=2;
		System.out.println(count);
		
		
		out.flush();
		out.close();
	}
}