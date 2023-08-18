public class Main{    public static void main(String[] args) {
        FastReader in = new FastReader();
        int n = in.nextInt();
        int[] a = new int[101];
        for (int i = 0; i < n; i++) {
            a[in.nextInt()]++;
        }
        int count = 0;
        for (int i = 1; i < 101; i++) {
            if (a[i] > 0) {
                count++;
                for (int j = i; j < 101; j += i) {
                    a[j] = 0;
                }
            }
        }
        System.out.println(count);

    }
}