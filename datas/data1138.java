public class Main{    public static void main (String[] args) throws java.lang.Exception {
        InputReader in = new InputReader(System.in);
        PrintWriter w = new PrintWriter(System.out);
        long n = in.nextLong();
        s = in.nextLong();
        long l = 0, h = n;
        while (l < h) {
            long mid = (l + h ) / 2;
           // System.out.println("mid is : " + mid);
           // System.out.println("high is : " + h);
            //System.out.println("low is : " + l);
            if (Ok(mid))
                h = mid;
            else
                l = mid + 1;
        }
        if (Ok(h))
            w.println(n - h + 1);
        else
            w.println(n - h);

        w.close();

    }
}