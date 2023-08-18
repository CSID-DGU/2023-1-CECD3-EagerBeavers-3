public class Main{    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        FastIO in = new FastIO();
        int n = in.ni();
        int a[] = in.gia(n);
        int freq[] = new int[100 + 1];
        for (int i = 0; i < n; i++) {
            freq[a[i]]++;
        }
        int k = 0;
        for (int i = 1; i <= 100; i++) {
            if (freq[i] > 0) {
                for (int j = i; j <= 100; j += i) {
                    freq[j] = 0;
                }
                k++;
                // System.out.println(i);
            }
        }
        System.out.println(k);
        in.bw.flush();
    }
}