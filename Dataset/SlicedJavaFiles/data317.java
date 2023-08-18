public class Main{	public static void main(String[] args) throws IOException {
 
		int n = in.nextInt();
		int q = in.nextInt();
		
		ArrayDeque<Integer> dq = new ArrayDeque<>();
		int max = -1;
		for(int i = 0; i < n; ++i) {
			int x = in.nextInt();
			dq.add(x);
			max = Math.max(max, x);
		}
		ArrayList<Pair> ans = new ArrayList<>();
		while(dq.peekFirst() != max) {
			int a = dq.pollFirst();
			int b = dq.pollFirst();
			ans.add(new Pair(a, b));
			if(a > b) {
				dq.addFirst(a);
				dq.addLast(b);
			}
			else {
				dq.addFirst(b);
				dq.addLast(a);
			}
		}
		ArrayList<Integer> a = new ArrayList<>();
		dq.pollFirst();
		for(int x : dq)
			a.add(x);
		while(q --> 0) {
			long m = in.nextLong() - 1;
			if(m < ans.size()) {
				System.out.println(ans.get((int)m).first + " " + ans.get((int)m).second);
			}
			else {
				int idx = (int)((m - ans.size()) % a.size());
				System.out.println(max + " " + a.get(idx));
			}
		}
		
		out.close();
	}
}