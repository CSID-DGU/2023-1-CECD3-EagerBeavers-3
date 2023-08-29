public class Main{    public static void main(String[] args) throws Exception {
        initTokenizer();

        int n = nextInt();
        int a = nextInt();
        int b = nextInt();

        int[] h = new int[n];

        initTokenizer();

        for (int i = 0; i < n; i++) {
            h[i] = nextInt();
        }

        Arrays.sort(h);

        System.out.print(h[b] - h[b - 1]);
    }
}