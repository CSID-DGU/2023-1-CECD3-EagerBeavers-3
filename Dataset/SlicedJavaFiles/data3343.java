public class Main{	public static void main(String [] args)
	{
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int m = in.nextInt();

		boolean [][] graph = new boolean[n][n];
		for(int i = 0 ; i < m ; i++)
		{
			int a = in.nextInt() - 1;
			int b = in.nextInt() - 1;

			graph[a][b] = true;
		}

		int res = Integer.MAX_VALUE;
		for(int center = 0 ; center < n ; center++)
		{
			int calc = 0;
			for(int i = 0 ; i < n ; i++)
			{
				if(!graph[center][i])
					calc++;
				if(!graph[i][center])
					calc++;
			}

			if(!graph[center][center])
				calc--;

			int [] match = new int[n];
			Arrays.fill(match, -1);
			int max = 0;

			for(int i = 0 ; i < n ; i++)
				if(i != center)
					if(can(i, graph, new boolean[n], center, match))
						max++;

			int unusable = m - (2*n - 1 - calc) - max;
			calc += unusable;
			calc += (2*(n-1) - 2*max)/2;

			res = Math.min(res, calc);
		}

		System.out.println(res);


	}
}