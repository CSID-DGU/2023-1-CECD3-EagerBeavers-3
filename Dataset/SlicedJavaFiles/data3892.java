public class Main{    public static void main(String[] args) throws Exception {
        FastIO in = new FastIO(args);
        int t = in.ni();
        while (t-- > 0) {
            int n = in.ni();
            LinkedList<Integer> l = new LinkedList<>();
            ArrayList<LinkedList<Integer>> al = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                int p = in.ni();
                if (p == 1) {
                    l.addFirst(1);
                } else {
                    while (true) {
                        if (l.peekFirst() == p - 1) {
                            l.addFirst(l.removeFirst() + 1);
                            break;
                        } else {
                            l.removeFirst();
                        }
                    }
                }
                al.add(new LinkedList<>(l));
            }
            for (LinkedList<Integer> ll : al) {
                while (ll.size() > 1) {
                    System.out.print(ll.removeLast() + ".");
                }
                System.out.println(ll.remove());
            }
            System.out.println();
        }
        in.bw.flush();
    }
}