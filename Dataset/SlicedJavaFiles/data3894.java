public class Main{	public static void main(String args[]) throws IOException
	{
		f = new FastIO();

		int t, n, a, i;
		Node r, p, c;
		
		t = f.ni();
		
		while(t-->0)
		{
			n = f.ni();
			r = p = new Node(-1, null);
			// f.out("1\n");

			for(i = 0; i < n; i++)
			{
				a = f.ni();
				if(a != 1)
				{
					while(a != p.i + 1)
						p = p.p;
					p = p.p;
				}
				// if(a == p.i + 1)
				// 	p = p.p;
				// else if(p.p != null && a == p.p.i + 1)
				// 	p = p.p.p;
				c = new Node(a, p);
				p.c.add(c);
				p = c;
			}

			dfs(r, "");
		}

		f.flush();
	}
}