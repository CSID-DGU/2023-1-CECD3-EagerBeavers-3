public class Main{	public static void main(String[] args) throws Exception {
		in = new Scanner(System.in);
//		in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
//		in = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintWriter(System.out);

        int n = next(), k = next()-1;
        int x[] = new int[n];
        for (int i = 0;i < n;i++) x[i] = (100-next())*100+next();
        Arrays.sort(x);
        int res = 0, t = x[k];
        for (int i = 0;i < n;i++) if (t == x[i]) res++;

        out.println(res);


        out.println();
		out.close();
	}
}