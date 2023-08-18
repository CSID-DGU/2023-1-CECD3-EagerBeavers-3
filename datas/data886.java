public class Main{	public static void main(String []args) throws IOException{
		PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));
		MyReader reader = new MyReader(new InputStreamReader(System.in));
		int n = reader.nextInt();
		int k = reader.nextInt();
		int []a = new int[n];
		for (int i = 0; i < n; ++i)
			a[i] = reader.nextInt();
		int j = 0;
		HashMap<Integer,Integer> map = new HashMap<>();
		for (int i = 0; i < n; ++i){
			if (map.containsKey(a[i]))
				map.put(a[i], map.get(a[i])+1);
			else{
				map.put(a[i], 1);
				if (map.size()==k) { j = i+1; break; }
			}
		}
		if (map.size()<k){
			System.out.println("-1 -1");
			return;
		}
		for (int i = 0; i < n; ++i){
			if (map.get(a[i])==1){
				System.out.println(i+1 + " " + j);
				return;
			}
			map.put(a[i], map.get(a[i])-1);
		}
	}
}