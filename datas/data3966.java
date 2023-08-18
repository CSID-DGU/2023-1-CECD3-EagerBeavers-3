public class Main{	public static void main(String[] args) throws IOException {
		nm = readIntArray();
		rows = Math.max(nm[0], nm[1]);
		cols = Math.min(nm[0], nm[1]);
		
		long s = System.currentTimeMillis();
		cae = new boolean[1000][50];
		ca = new int[1000][50];

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < cols; i++) {
			sb.append('1');
		}
		int startingState = Integer.parseInt(sb.toString(), 3);
		ans = solve(startingState, 0);

		System.out.println(nm[0]*nm[1] - ans);
//		System.out.println(System.currentTimeMillis() - s );
	}
}