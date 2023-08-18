public class Main{    public static void main (String argv[])
    {
        Scanner in = new Scanner(System.in);
        
        n = in.nextLong();
        x = in.nextLong();
        y = in.nextLong();
        c = in.nextLong();
        x--; y--;
        
        long lf = 0, rg = 2 * 1000 * 1000 * 1000 + 3;
        
        while (lf != rg)
        {
            long mid = (lf + rg) >> 1;
            
            if (can(mid))
                rg = mid;
            else
                lf = mid + 1;
        }
        
        System.out.println(lf);
    }
}