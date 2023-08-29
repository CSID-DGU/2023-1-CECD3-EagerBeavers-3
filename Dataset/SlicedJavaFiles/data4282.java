public class Main{	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		k = in.nextInt();
		A = in.nextInt();
		memo = new double[n+1][n+1][1<<n];
		l = new int[n];
		p = new int[n];
		for(int i=0; i<n; i++) {
			l[i] = in.nextInt();
			p[i] = in.nextInt();
		}
		System.out.printf("%.10f%n",go(0,k));
	}
}