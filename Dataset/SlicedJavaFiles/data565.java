public class Main{	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		int T = sc.nextInt();
		while(T-->0) {
			int n = sc.nextInt();
			if(n % 2 == 0 && issq(n/2)) {
				System.out.println("YES");
			}
			else if(n % 4 == 0 && issq(n/4)) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}

	}
}