public class Main{    public static void main(String[] args)throws Exception
    {
        Reader.init(System.in);
        int n = Reader.nextInt();
        int p = Reader.nextInt();
        int L = Reader.nextInt();
        int R = Reader.nextInt();
        int a = 1;
        int b = n;
        int res = 0;
        
        if(a == L && b == R)
        {
            res = 0;
        }
        else if(L != a && R != b && p >= L && p <= R)
        {
            res = Math.min(p-L, R-p);
            res += R- L + 2;
        }
        else if(L != a && R != b && p < L )
        {
            res += L-p + 1;
            res += R - L +1;
        }
        else if(L != a && R != b && p > R)
        {
            res += p-R + 1;
            res += R - L +1;
        }
        else if(a == L && p >=L && p<=R)
        {
            res += R - p + 1;
        }
        else if(R == b && p>=L && p<=R)
        {
            res += p - L + 1;
        }
        else if(a == L && p > R)
        {
            res += p - R + 1;
        }
        else if(R == b && p<L)
        {
            res += L - p + 1;
        }
            
            
        pw.print(res);
        pw.close();
 
    }
}