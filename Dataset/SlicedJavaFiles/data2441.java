public class Main{	public static void main(String[] args) {
		FastScanner in = new FastScanner(System.in);
		
		int N = in.nextInt();
		int[] arr = new int[N];
		for(int i = 0; i < N; i++)
			arr[i] = in.nextInt();
		
		long[] sum = new long[arr.length + 1];
		for(int i = 1; i < sum.length; i++)
			sum[i] = sum[i-1] + arr[i-1];
		
		HashMap<Long, ArrayList<Pair>> map = new HashMap<>();
		
		for(int i = 0; i < sum.length; i++) {
			for(int j = i+1; j < sum.length; j++) {
				long diff = sum[j] - sum[i];
				
				if(!map.containsKey(diff))
					map.put(diff, new ArrayList<>());
				
				ArrayList<Pair> list = map.get(diff);
				list.add(new Pair(i, j));
			}
		}
		
		for(long key : map.keySet()) {
			ArrayList<Pair> list1 = map.get(key);
			Collections.sort(list1);
			
			ArrayList<Pair> list2 = new ArrayList<>();
			
			int end = 0;
			for(Pair p : list1) {
				if(end <= p.a) {
					list2.add(p);
					end = p.b;
				}
			}
			
			map.put(key, list2);
		}
		
		long maxKey = -1;
		int max = -1;
		for(long key : map.keySet()) {
			if(map.get(key).size() > max) {
				max = map.get(key).size();
				maxKey = key;
			}
		}
		
		ArrayList<Pair> list = map.get(maxKey);
		StringBuilder sb = new StringBuilder();
		sb.append(list.size());
		sb.append("\n");
		
		for(Pair p : list) {
			sb.append((1 + p.a) + " " + p.b);
			sb.append("\n");
		}
		
		System.out.println(sb.toString());
	}
}