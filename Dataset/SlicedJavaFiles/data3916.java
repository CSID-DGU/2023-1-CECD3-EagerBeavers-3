public class Main{    public static void main(String[] args) throws Exception {
        //https://i...content-available-to-author-only...e.com/ebRGa6
        InputReader in = new InputReader(System.in);

        FastWriter out = new FastWriter(System.out);


//
//        f[0] = 1;
//        f[1] = 1;
//        for (int i = 2; i < 200001; ++i) {
//            f[i] = f[i-1] * i;
//            f[i] %= 1000000007;
//        }
        int t = in.readInt();


        while (t-- > 0) {

            int n = in.readInt();

            Stack<Integer> s = new Stack<>();

            System.out.println("1");
            int i1 = in.readInt();
            assert i1 == 1;
            s.add(1);
            for (int i = 1; i < n; ++i) {
                int next = in.readInt();
                if (next == 1) {
                } else {
                    while ((s.peek() + 1) != next) {
                        s.pop();
                    }
                    s.pop();
                }

                s.add(next);
                StringBuilder ans = new StringBuilder();
                for (int c: s) {
                    ans.append(c).append(".");
                }
                out.println(ans.substring(0, ans.length() - 1));
                out.flush();
            }

        }

    }
}