public class Main{	public static void main(String[] args) throws IOException {
		MyScanner sc = new MyScanner(System.in);
		String s = sc.nextLine();
		n = sc.nextInt();
		mem = new int[1 << n];
		Arrays.fill(mem, -1);
		map = new HashMap<>();
		map.put(0, s);
		for (int i = 1; i <= n; i++) {
			map.put(i, sc.nextLine());
		}
		int val = dp(0);
		PrintWriter pw = new PrintWriter(System.out);
		pw.println(val);
		sb = new StringBuilder();
		sb.append("0 ");
		build(0);
		pw.println(sb);
		pw.flush();
	}
}