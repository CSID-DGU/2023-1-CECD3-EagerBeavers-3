public class Main{    public static void main(String[] args) {
        final FastScanner fs = new FastScanner();
        final int t = fs.nextInt();
        final StringBuilder sb = new StringBuilder();
        for (int test = 0; test < t; test++) {
            final int n = fs.nextInt();
            final Deque<Node> dq = new ArrayDeque<>();
            dq.offerLast(new Node("", 0));
            for (int i = 0; i < n; i++) {
                final int next = fs.nextInt();
                if (dq.getFirst().val + 1 != next) {
                    if (next == 1) {
                        final Node peek = dq.getFirst();
                        final String p = peek.path.isEmpty() ? String.valueOf(peek.val)
                                                             : (peek.path + '.' + peek.val);
                        dq.addFirst(new Node(p, 1));
                    } else {
                        while (dq.getFirst().val + 1 != next) {
                            dq.removeFirst();
                        }
                        dq.getFirst().val++;
                    }
                } else {
                    dq.getFirst().val++;
                }
                add(sb, dq.getFirst(), dq.getFirst().val);
            }
        }
        System.out.println(sb);
    }
}