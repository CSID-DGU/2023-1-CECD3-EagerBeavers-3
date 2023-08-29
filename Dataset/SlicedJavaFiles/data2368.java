public class Main{    public static void main(String[] args) throws FileNotFoundException {
        // PrintWriter out = new PrintWriter(new FileOutputStream(new File(
        // "output.txt")));
        PrintWriter out = new PrintWriter(System.out);
        Scanner in = new Scanner();
        int n = in.nextInt();
        int[] data = new int[n];
        for (int i = 0; i < n; i++) {
            data[i] = in.nextInt();
        }
        FT tree = new FT(n + 1);
        int result = 0;
        for (int i = n - 1; i >= 0; i--) {
            tree.update(data[i], 1);
            result += tree.get(data[i] - 1);
            result %= 2;
        }
        int q = in.nextInt();
        int[] tmp = new int[n];
        for (int i = 0; i < q; i++) {
            int l = in.nextInt() - 1;
            int r = in.nextInt() - 1;
            FT a = new FT(n + 1);
            int total = r - l + 1;
            total = total * (total - 1) / 2;
            total %= 2;
//            for (int j = r; j >= l; j--) {
//                tmp[j] = data[j];
//                a.update(data[j], 1);
//                total -= a.get(data[j] - 1);
//               // total += 2;
//               // total %= 2;
//            }
            
            // System.out.println("PRE " + result);
            // System.out.println(Arrays.toString(tmp));
//            for (int j = 0; j < (r - l + 1) / 2; j++) {
//                data[r - j] = tmp[l + j];
//                data[l + j] = tmp[r - j];
//            }
            result += total;
            result %= 2;
           // System.out.println("AFTER " + result);
           // System.out.println(Arrays.toString(data));
            if (result % 2 == 0) {
                out.println("even");
            } else {
                out.println("odd");
            }
        }
        out.close();
    }
}