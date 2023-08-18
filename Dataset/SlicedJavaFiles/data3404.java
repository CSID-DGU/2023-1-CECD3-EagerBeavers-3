public class Main{	public static void main( String[] args )
	{
		String s = in.next();
		int n = s.length(), ans = 0;
		for( int i = 0; i < n; i++ ) for( int j = i+1; j < n; j++ )
		{
			int l = 0;
			while( j+l<n && s.charAt(i+l)==s.charAt(j+l) ) l++;
			ans = Math.max( ans, l );
		}
		System.out.println( ans );
	}
}