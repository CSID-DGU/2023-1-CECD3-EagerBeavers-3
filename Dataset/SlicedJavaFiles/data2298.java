public class Main{	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		int n = sc.nextInt();
		statements = new ArrayList<>();

		char[] c = new char[n];
		for (int i = 0; i < n; i++) {
			c[i] = sc.next().charAt(0);
		}

		if(c[0] == 's')
			statements.add(0);
		else
			statements.add(1);

		for (int i = 1; i < n; i++) {
			if(c[i - 1] == 'f') {
				if(c[i] == 'f')
					statements.set(statements.size() - 1, statements.get(statements.size() - 1) + 1);
			}else {

				if(c[i] == 's')
					statements.add(0);
				else
					statements.add(1);
			}
		}


		memo = new int[statements.size()][n + 1];

		for(int[] a : memo)
			Arrays.fill(a, -1);
		out.println(solve(0, 0));
		out.flush();
		out.close();
	}
}