public class Main{	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,r,l;
		n = sc.nextInt();
		while(n-->0) {
			l = sc.nextInt();
			r = sc.nextInt();

			System.out.println(f(r)-f(l-1));
		}
		sc.close();
	}
}