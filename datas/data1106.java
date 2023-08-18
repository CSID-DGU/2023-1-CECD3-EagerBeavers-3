public class Main{	public static void main(String[] args) {
		cin = new Scanner(System.in);
		n = cin.nextInt();
		a = new int[MAXN];
		used = new boolean[MAXN];
		if(n % 4 != 0) {
			System.out.println("! -1\n");
			System.out.flush();
			cin.close();
			return;
		}
		int l = 1, r = n / 2, mid;
		while(l <= r) {
			mid = (l + r) / 2;
			int x = Q(mid);
			if(Q(l) * x < 0) {
				r = mid - 1;
			} else if(x * Q(r) < 0) {
				l = mid + 1;
			}
		}
		System.out.println("! -1\n");
		System.out.flush();
		cin.close();
	}
}