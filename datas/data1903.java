public class Main{    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        // BufferedReader in = new BufferedReader(new
        // InputStreamReader(System.in));
        int n = in.readInt();
        int[] inp = new int[n];
        for (int i = 0; i < inp.length; i++) {
            inp[i] = in.readInt();
        }
        Arrays.sort(inp);
        int sum1 = 0;
        int res = 0;
        for (int i = inp.length - 1; i >= 0; i--) {
            sum1 += inp[i];
            res++;
            int sum2 = 0;
            for (int j = 0; j < i; j++) {
                sum2 += inp[j];
            }
            if (sum1 > sum2) {
                break;
            }
        }
        System.out.println(res);
    }
}