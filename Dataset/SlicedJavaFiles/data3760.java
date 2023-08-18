public class Main{	public static void main(String args[]) throws IOException
	{
		f = new FastIO();

		int n = f.ni(), m = f.ni(), k = f.ni(), i, j;
		ve = new long[n-1][];
		he = new long[n][];

		long[][] ans = new long[n][m], pans = new long[n][m], temp;

		for(i = 0; i < n; i++)
			he[i] = f.nla(m-1);

		for(i = 0; i < n-1; i++)
			ve[i] = f.nla(m);

		if(k%2 == 1)
		{
			for(i = 0; i < n; i++)
				Arrays.fill(ans[i], -1L);
		}
		else
		{
			k /= 2;

			while(k-->0)
			{
				for(i = 0; i < n; i++)
				{
					for(j = 0; j < m; j++)
					{
						ans[i][j] = Integer.MAX_VALUE;

						if(i != 0)
							ans[i][j] = Math.min(ans[i][j], pans[i-1][j] + 2*edge(i, j, i-1, j));

						if(i != n-1)
							ans[i][j] = Math.min(ans[i][j], pans[i+1][j] + 2*edge(i, j, i+1, j));

						if(j != 0)
							ans[i][j] = Math.min(ans[i][j], pans[i][j-1] + 2*edge(i, j, i, j-1));

						if(j != m-1)
							ans[i][j] = Math.min(ans[i][j], pans[i][j+1] + 2*edge(i, j, i, j+1));
					}
				}

				// f.err(k + "\n");
				// errorprint(ans, n, m);

				temp = pans;
				pans = ans;
				ans = temp;
			}

			temp = pans;
			pans = ans;
			ans = temp;
		}

		for(i = 0; i < n; i++)
		{
			for(j = 0; j < m; j++)
			{
				f.out(ans[i][j] + " ");
			}

			f.out("\n");
		}

		f.flush();
	}
}