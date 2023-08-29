public class Main{	public static void main(String[] args) {
		Reader in = new Reader();
		int n = in.nextInt();
		int[] a = in.na(n);
		HashMap<Long, ArrayList<Pair>> v = new HashMap<>();
		for(int i = 0; i<n; i++) {
			long s  = 0;
			for(int j = i; j<n; j++) {
				s+=a[j];
				Pair p = new Pair(i+1, j+1);
				if(v.containsKey(s)) {
					v.get(s).add(p);
				}else {
					ArrayList<Pair> xd = new ArrayList<>();
					xd.add(p);
					v.put(s,xd);
				}
			}
		}
		ArrayList<Pair> ans = new ArrayList<>();
		for(Entry<Long,ArrayList<Pair>> e : v.entrySet()) {
			ArrayList<Pair> pairs = e.getValue();
			Collections.sort(pairs);
			Stack<Pair> st = new Stack<>();
			for(int i = 0; i<pairs.size(); i++) {
				Pair cur = pairs.get(i);
				if(st.isEmpty()||st.peek().r<cur.l) {
					st.push(cur);
				}else if(st.peek().r>cur.r) {
						st.pop();
						st.push(cur);
				}
				if(st.size()>ans.size()) ans = new ArrayList<>(st);
			}
		}
		System.out.println(ans.size());
		for(Pair p : ans)
			System.out.println(p.l +" "+p.r);
	}
}