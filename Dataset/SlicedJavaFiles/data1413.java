public class Main{    public static void main( String[] args ) throws IOException
    {
        Scanner s=new Scanner( System.in );
        N=s.nextLong();
        k=s.nextInt();
        WHOLESUM=SUM( k );
        if( N<=1 )
            System.out.println(0 );
        else
            System.out.println( binarySearch( 2, k ) );
    }
}