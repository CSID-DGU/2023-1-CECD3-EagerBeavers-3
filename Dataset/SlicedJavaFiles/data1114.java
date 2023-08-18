public class Main{    public static void main(String[] args) throws FileNotFoundException {
//        InputReader in = new InputReader(new FileInputStream("input.txt"));
//        PrintWriter out = new PrintWriter(new BufferedOutputStream(new FileOutputStream("milkvisits.out")));
//
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

        int n = in.nextInt();
        if (n / 2 % 2 != 0) {
            out.println("! -1");
            out.flush();
            out.close();
            return;
        }

        int[] a = new int[n];
        Arrays.fill(a, Integer.MAX_VALUE);

        int l1 = 0;
        int r1 = l1 + n / 2;

        int l2 = r1;
        int r2 = n;

        int ans = -1;

        while (true) {
            getValue(in, out, a, l1);
            getValue(in, out, a, r1);

            getValue(in, out, a, l2);
            getValue(in, out, a, r2 % n);

            if (a[l1] == a[l2]) {
                ans = l1;
                break;
            }
            if (a[r1] == a[r2 % n]) {
                ans = r1;
                break;
            }

            int m1 = (l1 + r1) / 2;
            getValue(in, out, a, m1);

            int m2 = (l2 + r2) / 2;
            getValue(in, out, a, m2);

            if (a[m1] == a[m2]) {
                ans = m1;
                break;
            }

            if ((a[l1] <= a[m1] && a[l2] <= a[m2]) || (a[l1] >= a[m1] && a[l2] >= a[m2])) {
                if (a[l1] <= a[l2] && a[m1] >= a[m2]) {
                    r1 = m1;
                    r2 = m2;
                    continue;
                }

                if (a[l1] >= a[l2] && a[m1] <= a[m2]) {
                    r1 = m1;
                    r2 = m2;
                    continue;
                }
            }

            if (a[l1] <= a[m1] && a[l2] >= a[m2] && a[l1] <= a[l2] && a[m1] >= a[m2]){
                r1 = m1;
                r2 = m2;
                continue;
            }

            if (a[l1] >= a[m1] && a[l2] <= a[m2] && a[l1] >= a[l2] && a[m1] <= a[m2]){
                r1 = m1;
                r2 = m2;
                continue;
            }

            l1 = m1;
            l2 = m2;
        }
        out.println("! " + (ans + 1));

        out.close();
    }
}