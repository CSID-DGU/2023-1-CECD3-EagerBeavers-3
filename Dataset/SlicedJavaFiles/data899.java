public class Main{    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        nextLine(br);
        int n = nextInt();
        int k = nextInt();
        int[] a = new int[n];
        nextLine(br);
        for (int i = 0; i < n; i++) a[i] = nextInt();
        
        int bp = 0, fp = 0, count = 0;
        boolean good = false;
        int[] mark = new int[100001];
        for (fp = 0; fp < n; fp++)
        {
            if (mark[a[fp]] == 0)
            {
                count++;
            }
            mark[a[fp]]++;
            if (count == k)
            {
                good = true;
                break;
            }
        }
        if (!good)
        {
            System.out.println("-1 -1");
            return;
        }
        for (bp = 0; bp < fp; bp++)
        {
            if (mark[a[bp]] > 1)
            {
                mark[a[bp]]--;
            }
            else break;
        }
        System.out.println((bp+1) + " " + (fp+1));
    }
}