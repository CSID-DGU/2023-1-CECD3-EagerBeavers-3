public class Main{    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        n = Math.max(x, y);
        m = Math.min(x, y);
        DP = new int[n][1 << m][1 << m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < (1 << m); j++)
                Arrays.fill(DP[i][j], -1);
        System.out.println(get(0, (1 << m) - 1, 0));
    }
}