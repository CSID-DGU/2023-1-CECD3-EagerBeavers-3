public class Main{    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = sc.nextInt();
        Integer[] a = new Integer[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        int ans = 0;
        boolean[] taken = new boolean[n];
        Arrays.sort(a);
        for (int i = 0; i < n; i++) {
            if (taken[i]) continue;
            ans++;
            for (int j = i; j < n; j++)
                if (a[j] % a[i] == 0) taken[j] = true;
        }
        out.println(ans);
        out.flush();
        out.close();
    }
}