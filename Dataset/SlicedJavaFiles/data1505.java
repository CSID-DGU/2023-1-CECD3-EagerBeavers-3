public class Main{	public static void main( final String[] args ) throws Exception {
		final BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		final String line = br.readLine();
		final StringTokenizer tok = new StringTokenizer( line );

		final long L = Long.parseLong( tok.nextToken() );
		final long R = Long.parseLong( tok.nextToken() );

		System.out.println( solve( L, R ) );
	}
}