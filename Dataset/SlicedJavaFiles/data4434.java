public class Main{	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		m = in.nextInt();
		if(n > m) {
			int tmp = n;
			n = m;
			m = tmp;
		}
		s = (1<<n);
		memo = new int[s][s][m];
		for(int i=0; i<s; i++)
			for(int j=0; j<s; j++)
				Arrays.fill(memo[i][j], -1);
		int ret = go(0,0,0);
		System.out.println(n*m - ret);
	}
}