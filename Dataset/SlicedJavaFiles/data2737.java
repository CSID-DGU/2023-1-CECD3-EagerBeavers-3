public class Main{    public static void main(String[] args) throws IOException {
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(f.readLine());
        if (n == 1 || n == 2)
            System.out.println(n);
        else if (n % 2 == 1)
            System.out.println(n*(n-1)*(n-2));
        else
        {
            long prod = n*(n-1);
            long x = n-2;
            while (x > 0 && gcd(n,x) > 1 || gcd(n-1,x) > 1)
                x--;
            prod *= x;
            if ((n-1)*(n-2)*(n-3) > prod)
                prod = (n-1)*(n-2)*(n-3);
            System.out.println(prod);
        }
    }
}