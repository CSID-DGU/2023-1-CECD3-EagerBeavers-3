public class Main{    public static void main(String[] args) throws NumberFormatException,
            IOException {
        // BufferedReader in = new BufferedReader(new
        // InputStreamReader(System.in));
        InputReader4 in = new InputReader4(System.in);
        int n = in.readInt();
        int k = in.readInt();
        p[] inp = new p[n];
        for (int i = 0; i < inp.length; i++) {
            inp[i] = new p(in.readInt(), in.readInt());
        }
        Arrays.sort(inp);
        for (int i = 0; i < inp.length;) {
            int j = i + 1;
            while (j < inp.length && inp[i].x == inp[j].x
                    && inp[i].y == inp[j].y) {
                j++;
            }
            int num = j - i;
            if (k <= num) {
                System.out.println(num);
                return;
            } else
                k -= num;
            i = j;
        }
    }
}