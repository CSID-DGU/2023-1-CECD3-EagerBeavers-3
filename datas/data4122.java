public class Main{	public static void main(String[] args) {
		InputReader0 in = new InputReader0(System.in);
		int x = in.nextInt(), y = in.nextInt();
		int n = in.nextInt();
		r = 1 << n;
		v = r - 1;
		dp = new int[r];
		nextstate = new int[r];
		pos = new int[n + 1][2];
		pos[0][0] = x;
		pos[0][1] = y;
		for (int i = 1; i < pos.length; i++) {
			pos[i][0] = in.nextInt();
			pos[i][1] = in.nextInt();
		}
		dist = new int[n + 1][n + 1];
		for (int i = 0; i < dist.length; i++) {
			for (int j = i + 1; j < dist.length; j++) {
				dist[i][j] = dist[j][i] = distace(pos[i][0], pos[j][0], pos[i][1], pos[j][1]);
			}
		}

		System.out.println(solve(0));
		System.out.print("0 ");
		print(0);
	}
}