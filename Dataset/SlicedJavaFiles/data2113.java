public class Main{    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), m = sc.nextInt();

        a = new int[101];
        for (int i = 0; i < m; i++) {
            int type = sc.nextInt();
            a[type] = a[type] + 1;
        }

        int lo=1, hi=100, max=0;

        while (lo <= hi) {
            int mid = lo + (hi - lo)/2;
            if (check(n, mid)) {
                max = mid;
                lo = mid+1;
            } else {
                hi = mid -1;
            }
        }
        System.out.println(max);
    }
}