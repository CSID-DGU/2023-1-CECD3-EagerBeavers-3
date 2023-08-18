public class Main{    public static void main(String[] args) throws FileNotFoundException {
//		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
//		MyScanner sc = new MyScanner();
		Scanner sc = new Scanner(new File("input.txt"));
		PrintWriter out = new PrintWriter("output.txt");
		n = sc.nextInt();
		m = sc.nextInt();
		k = sc.nextInt();
		ArrayDeque<iPair> qq = new ArrayDeque<>();
		boolean[][] vis = new boolean[n+1][m+1];
		for(int i = 0; i < k; i++) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			qq.add(new iPair(u, v));
			vis[u][v] = true;
		}
		iPair last = null;
		while(!qq.isEmpty()) {
			iPair pp = qq.poll();
			int i = pp.f;
			int j = pp.s;
			if(isValid(i-1, j) && !vis[i-1][j]) {
				qq.add(new iPair(i-1, j));
				vis[i-1][j] = true;
			}
			if(isValid(i+1, j) && !vis[i+1][j]) {
				qq.add(new iPair(i+1, j));
				vis[i+1][j] = true;
			}
			if(isValid(i,  j-1) && !vis[i][j-1]) {
				qq.add(new iPair(i, j-1));
				vis[i][j-1] = true;
			}
			if(isValid(i, j+1) && !vis[i][j+1]) {
				qq.add(new iPair(i, j+1));
				vis[i][j+1] = true;
			}
			last = pp;
		}
		out.println(last.f + " " + last.s);
		sc.close();
		out.close();
	}
}