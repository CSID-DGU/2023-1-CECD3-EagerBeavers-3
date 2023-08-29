public class Main{	public static void main(String[] args) throws IOException
	{
		Scanner in = new Scanner("input.txt");
		PrintWriter out = new PrintWriter(new FileWriter("output.txt"));
		n=in.nextInt();
		m=in.nextInt();
		burned=new boolean[n][m];
		int k=in.nextInt();
		Queue<Pair> queue=new LinkedList<>();
		Pair prev=null;
		for(int i=0;i<k;i++)
		{
			int x=in.nextInt();
			int y=in.nextInt();
			burned[x-1][y-1]=true;
			queue.add(prev=new Pair(x-1, y-1));
		}
		while(!queue.isEmpty())
		{
			Queue<Pair> tempqueue=new LinkedList<>();
		for(Pair p : queue)
		{
			int x=p.x;
			int y=p.y;
			prev=p;
			for(int i=0;i<4;i++)
			{
				if(isvalid(x+dx[i], y+dy[i])&&!burned[x+dx[i]][y+dy[i]])
				{
					tempqueue.add(new Pair(x+dx[i], y+dy[i]));
					burned[x+dx[i]][y+dy[i]]=true;
				}
			}
		}
		queue=tempqueue;
		}
		out.printf("%d %d\n",(prev.x+1),(prev.y+1));
		out.close();

	}
}