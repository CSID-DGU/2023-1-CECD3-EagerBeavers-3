public class Main{    public static void main(String[] args) throws IOException{        
        
        File file = new File("input.txt");
        if(file.exists())in = new InputReader( new FileInputStream(file) );
        else in = new InputReader( System.in );
        
        int n=in.nextInt(), m=in.nextInt(), k=in.nextInt();
        int a[]=new int[n];
        for( int i=0; i<n; i++ ) a[i]=in.nextInt();
        Arrays.sort( a );
        int i=n-1, ans=0;
        while( k<m && i>=0 ) {
            k+=a[i]-1;
            i--;
            ans++;
        }
        if( m<=k ) System.out.println( ans );
        else System.out.println("-1");
    } 
}