public class Main{    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long s = sc.nextLong();
        
        int r = 0 ;
        
        long l = 0L ;
        long u = n ;
        
        if(  (l-sumDigits(l)< s )  && (u-sumDigits(u)< s ) )
        {
            System.out.println(0);
            return ;
        }
        
        long specified = 0L ;
        while( true )
        {
            long m = (l + u) / 2L ;
            
            if( ( m - sumDigits(m) ) >= s && ( (m-1) - sumDigits(m-1) ) < s  )
            {
                specified = m ;
                break ;
            }
            
            if( l > u  )
                break ;
            
            else
            {
                if( ( m - sumDigits(m) ) >= s )
                    u = m-1 ;
                else
                    l = m+1 ;
            }
        }
        
        System.out.println( n-specified+1 );
        
        
    }
}