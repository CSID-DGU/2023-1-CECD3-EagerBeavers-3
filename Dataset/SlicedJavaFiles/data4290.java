public class Main{    public static void main(String[] args) {
        Scanner in = new Scanner(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        int k = in.nextInt();
        int A = in.nextInt();
        data = new Senator[n];
        for (int i = 0; i < n; i++) {
            data[i] = new Senator(in.nextInt(), in.nextInt());
        }
        out.println(cal(0, new int[n], A, k));

        out.close();
    }
}