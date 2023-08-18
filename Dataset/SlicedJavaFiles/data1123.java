public class Main{    public static void main(String[] args) throws IOException 
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        PrintWriter out = new PrintWriter(System.out);
        long n = Long.parseLong(st.nextToken());
        long s = Long.parseLong(st.nextToken());
        
        int r = 0 ;
        
        long l = 0L ;
        long u = n ;
        
        if(  (l-sumDigits(l)< s )  && (u-sumDigits(u)< s ) )
        {
            out.println(0);
            out.flush();
            out.close();
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
        
        out.println( n-specified+1 );
        out.flush();
        out.close();
        
    }
}