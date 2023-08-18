public class Main{	public static void main( String[] args )
	{
		int n = in.nextInt(), t = 2*in.nextInt(), h[][] = new int[n][2], ans = 2;
		for( int i = 0; i < n; i++ )
		{
			h[i][0] = 2*in.nextInt();
			h[i][1] = in.nextInt();
		}
		Arrays.sort( h, new Comp() );
		for( int i = 1; i < n; i++ )
		{
			int d = (h[i][0]-h[i][1])-(h[i-1][0]+h[i-1][1]);
			if( d>t ) ans += 2;
			if( d==t ) ans++;
		}
		System.out.println( ans );
	}
}