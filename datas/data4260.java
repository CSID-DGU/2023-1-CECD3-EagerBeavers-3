public class Main{	public static void main(String[] args){
		JS scan = new JS();
		PrintWriter out = new PrintWriter(System.out);
		int t = scan.nextInt();
		for(int q = 1; q <= t; q++){
			ans = 0;
			n = scan.nextInt();
			m = scan.nextInt();
			mat = new int[n][m];
			for(int i = 0; i < n; i++){
				for(int j = 0; j < m; j++){
					mat[i][j] = scan.nextInt();
				}
			}
			int[] max = new int[m];
			PriorityQueue<Item> pq = new PriorityQueue<Item>();
			for(int i = 0; i < m; i++){
				for(int j = 0; j < n; j++){
					max[i] = Math.max(max[i], mat[j][i]);
				}
				pq.add(new Item(i, max[i]));
			}
			ArrayList<Item> guys = new ArrayList<Item>();
			while(!pq.isEmpty() && guys.size() < 8){
				Item tt = pq.poll();
				guys.add(tt);
			}
			perm(guys, 0, new int[guys.size()]);
			out.println(ans);
		}
		out.flush();
	}
}