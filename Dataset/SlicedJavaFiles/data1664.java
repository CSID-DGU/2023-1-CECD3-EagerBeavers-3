public class Main{	public static void main(String[] args) throws Exception {
		in = new Scanner(System.in);
//		in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
//		in = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintWriter(System.out);

        int n = next(), a = next(), b = next();
        int h[] = new int[n];

        for (int i = 0;i < n;i++) h[i] = next();

        Arrays.sort(h);

        int res = h[b] - h[b-1];

        out.println(res);

        out.println();
		out.close();
	}
}