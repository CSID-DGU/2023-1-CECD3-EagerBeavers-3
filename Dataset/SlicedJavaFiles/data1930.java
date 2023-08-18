public class Main{    public static void main( final String[] args ) throws IOException {
        final BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
        final int n = Integer.parseInt( br.readLine() );
        final int[] a = new int[n];
        final String[] parts = br.readLine().split( " " );
        for ( int i = 0; i < n; ++i ) {
            a[ i ] = Integer.parseInt( parts[ i ] );
        }
        System.out.println( solve( n, a ) );
    }
}