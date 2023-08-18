public class Main{    public static void main(String[] args) {
        InputReader r = new InputReader(System.in);
        n = r.nextInt();
        a = r.nextInt();
        b = r.nextInt();
        int[] list = new int[n];
        for (int i = 0; i < n; i++) {
            list[i] = r.nextInt();
            arr.add(list[i]);
        }
        for (int x : arr) {
            if (!visited.contains(x)) {
                if (arr.contains(a - x) && arr.contains(b - x))
                    continue;
                if (arr.contains(a - x) || arr.contains(b - x)) {
                    dfs(x, -1, 1);
                } else {
                    System.out.println("NO");
                    System.exit(0);
                }
            }
        }
        PrintWriter out = new PrintWriter(System.out);
        out.println("YES");
        for (int i = 0; i < list.length; i++) {
            if (result.get(list[i]) == null)
                out.println(0);
            else
                out.println(result.get(list[i]));
        }
        out.close();

    }
}