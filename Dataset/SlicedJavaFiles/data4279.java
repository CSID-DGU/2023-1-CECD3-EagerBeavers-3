public class Main{	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int k = sc.nextInt();
		A = sc.nextInt();
		b = new int[n];
		l = new int[n];
		sw = new int[n];
		for(int i=0; i<n; i++) {
			b[i] = sc.nextInt();
			l[i] = sc.nextInt();
		}
		max = 0;
		search(k, 0);
		System.out.println(max);
	}
}