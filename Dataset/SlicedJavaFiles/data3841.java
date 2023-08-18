public class Main{	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		int c = 1;
		int t = Integer.parseInt(br.readLine());

		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			HashMap<Integer, Integer> map = new HashMap<>();
			// map.put(1, 0);
			int curr = 0;
			for (int i = 0; i < n; i++) {
				int tt = Integer.parseInt(br.readLine());
				if (tt == 1) {
					curr++;
					map.put(curr, 1);
				} else {
					ArrayList<Integer> list = new ArrayList<Integer>(map.keySet());
					Collections.sort(list);
					for (int a = list.size() - 1; a >= 0; a--) {
						if (map.get(list.get(a)) == tt - 1) {
							map.put(list.get(a), tt);
							break;
						} else {
							curr--;
							map.remove(list.get(a));
						}
					}
				}
				ArrayList<Integer> list = new ArrayList<Integer>(map.keySet());
				Collections.sort(list);
				StringBuilder str=new StringBuilder();
				for(int a=0;a<list.size();a++) {
					if(list.size()-1==a) {
						str.append(map.get(list.get(a)));
						continue;
					}
					str.append(map.get(list.get(a))+".");
				}pw.println(str);

			}

		}
		pw.close();
	}
}