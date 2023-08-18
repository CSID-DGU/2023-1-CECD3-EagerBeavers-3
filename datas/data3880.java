public class Main{    public static void main(String[] args) throws IOException {
        FastScanner scn = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        for (int tc = scn.nextInt(); tc > 0; tc--) {
            int N = scn.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = scn.nextInt();
            }
            StringBuilder[] ans = new StringBuilder[N];
            ans[0] = new StringBuilder("1");
            ArrayDeque<Integer> st = new ArrayDeque<>();
            st.addLast(0);
            for (int i = 1; i < N; i++) {
                // System.out.println(st);
                ans[i] = new StringBuilder();
                if (arr[i] == 1) {
                    st.addLast(i);
                    ans[i].append(ans[i - 1].toString() + ".1");
                } else {
                    while (arr[st.getLast()] != arr[i] - 1) {
                        st.removeLast();
                    }
                    int pos = st.removeLast();
                    String[] prev = ans[pos].toString().split("[.]");
                    for (int j = 0, sz = prev.length - 1; j < sz; j++) {
                        ans[i].append(prev[j] + ".");
                    }
                    ans[i].append(arr[i] + "");
                    st.addLast(i);
                }
            }
            for (StringBuilder str : ans) {
                out.println(str);
            }
        }
        out.close();
    }
}