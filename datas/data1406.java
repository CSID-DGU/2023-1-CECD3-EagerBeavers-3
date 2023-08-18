public class Main{    public static void main(String[] args) throws IOException {
        long n = nextLong();
        int k = nextInt();
        if (n == 1) {
            System.out.println(0);
            return;
        }
        long sum = (((2 + (long) k)) * ((long) k - 1)) / 2 - ((long) k - 2);
        if (n > sum) {
            System.out.println(-1);
            return;
        } else if (n <= k) {
            System.out.println(1);
            return;
        }

        long cnt = 0;
        long sum2 = 0;
        int index = binSearch(2, k, k, n);

        sum2 = (((long) (index) + k) * (long) (k - index + 1)) / 2 - (long) (k - index);
        cnt = k - index + 1;
        if (sum2 == n) {
            System.out.println(cnt);
            return;
        }
        if (sum2 > n)
            for (int kk = index; kk <= k; kk++) {
                sum2 = (((long) (kk) + k) * (long) (k - kk + 1)) / 2 - (long) (k - kk);
                cnt--;
                if (sum2 <= n) {
                    System.out.println(cnt + 1);
                    return;
                }
            }
        else {
            for (int kk = index - 1; kk >= 2; kk--) {
                sum2 = (((long) (kk) + k) * (long) (k - kk + 1)) / 2 - (long) (k - kk);
                cnt++;
                if (sum2 >= n) {
                    System.out.println(cnt);
                    return;
                }
            }
        }
        System.out.println(-1);
        return;
    }
}