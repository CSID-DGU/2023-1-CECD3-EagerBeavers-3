public class Main{    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long n, s;

        String arr[] = br.readLine().split(" ");

        n = Long.parseLong(arr[0]);
        s = Long.parseLong(arr[1]);

        long l = 1;
        long h = n;

        while (l < h) {
            long mid = (l + h) / 2;
            if (greater(mid, s)) {
                h = mid;
            } else {
                l = mid + 1;
            }
        }

        System.out.println(greater(h, s) ? n - h + 1 : 0);

    }
}