public class Main{    public static void main (String args [])
    {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int n1 = n; boolean q = true;
        while (n1 > 0)
        {
            if (n % n1 == 0)
            {
                if (check(n1))
                {
                    System.out.print("YES");
                    q = false;
                    break;
                }   
            }
            n1--;
        }
        if (q) System.out.print("NO");
        
    }
}