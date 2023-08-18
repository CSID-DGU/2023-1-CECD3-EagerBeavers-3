public class Main{    public static void main(String[] args) throws IOException {
        int n = in.nextInt();
        int d = in.nextInt();

        int[] a = in.arrayInt(n);

        int count = 2;

        for(int i = 0 ;i < n-1; i++) {
            if( a[i+1] - a[i] == 2 * d )
                count += 1;
            if( a[i+1] - a[i] > 2 * d)
                count += 2;
        }

        out.println(count);



        log.flush();
        in.close();
    }
}