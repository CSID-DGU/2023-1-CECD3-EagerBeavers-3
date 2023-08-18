public class Main{	public static void main(String[] args){
		String buffer = null;
		StringTokenizer st = null;
		Forest f = null;
		List<Pair> pairs = new LinkedList<Pair>();
		Integer N,M,K,x,y;
		try {
			BufferedReader in = new BufferedReader(
							new FileReader("input.txt")
							);
			FileWriter out = new FileWriter("output.txt");
			buffer = in.readLine();
			st = new StringTokenizer(buffer);
			N = new Integer(st.nextToken());
			M = new Integer(st.nextToken());
			f = new Forest(N,M);
			buffer = in.readLine();
			st = new StringTokenizer(buffer);
			K = new Integer(st.nextToken());
			buffer = in.readLine();
			st = new StringTokenizer(buffer);
			for(int i = 0; i<K; i++){
				x = new Integer(st.nextToken());
				y = new Integer(st.nextToken());
				f.desk[x-1][y-1] = 1;
				pairs.add(new Pair(x-1,y-1));
			}
			Pair res = solve(f,pairs);
			
			out.write(res.toString());
			out.flush();
		} catch (Exception e) {
		}
	}
}