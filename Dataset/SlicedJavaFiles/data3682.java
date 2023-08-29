public class Main{	public static void main(String[] args) throws IOException 
	{
		Scanner sc = new Scanner("input.txt");
		PrintWriter out = new PrintWriter("output.txt");
		Queue<Pair> q = new LinkedList<Pair>();
		int n = sc.nextInt(),m = sc.nextInt() , k = sc.nextInt();
		boolean [][] vis = new boolean[n][m];
		while(k-->0)
			q.add(new Pair(sc.nextInt()-1,sc.nextInt()-1));
	
		int ansX = 1 , ansY = 1;
		
		while(!q.isEmpty())
		{
			Pair cur = q.poll();
			if(vis[cur.i][cur.j])continue;
			ansX = cur.i ; ansY = cur.j;
			vis[cur.i][cur.j] = true;
			for (int i = 0; i < di.length; i++) {
				int ni = cur.i + di[i] , nj = cur.j + dj[i];
				if(ni>=0 && ni<n && nj>=0 && nj<m && !vis[ni][nj])
					q.add(new Pair(ni,nj));
			}
		}
		
		out.append(++ansX+" "+ ++ansY);
		out.flush();
		
	}
}