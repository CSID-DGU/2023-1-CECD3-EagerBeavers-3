public class Main{	public static void main(String[] args) throws Exception {
		in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		out = new PrintWriter(System.out);
		
		ArrayList<Integer> p = new ArrayList<Integer>();
		ArrayList<Integer> o = new ArrayList<Integer>();
		
		int n = nextInt();
		for (int i=0; i<n; i++) {
			int a = nextInt();
			if (a % 2 == 0) p.add(i+1);
			else o.add(i+1);
		}
		
		if (p.size() < o.size()) out.println(p.get(0));
		else out.println(o.get(0));

		out.flush();

	}
}