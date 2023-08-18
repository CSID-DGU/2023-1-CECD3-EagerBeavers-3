public class Main{    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            Stack<Integer> s = new Stack<>();
            int [] a = new int[n];
            for (int i = 0; i < n; ++i) a[i] = sc.nextInt();
            for (int i = 0; i < n; i++) {
                if (a[i] == 1) {
                    s.push(1);
                } else {
                    while (s.peek() != a[i] - 1) {
                        s.pop();
                    }
                    s.pop();
                    s.push(a[i]);
                }
                print(s);
            }
        }
        out.close();
    }
}