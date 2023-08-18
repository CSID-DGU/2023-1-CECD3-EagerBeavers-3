public class Main{    public static void main(String[] args) {

        Scanner in = new Scanner();
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        int m = in.nextInt();
        min = Math.min(n, m);
        max = (m + n) - min;
        dp = new int[max][1 << min][1 << min];

        for (int[][] temp : dp) {
            for (int[] val : temp) {
                Arrays.fill(val, -1);
            }
        }
        need = (1 << min) - 1;
        //System.out.println(add + total);
        //  System.out.println(min + " " + max);

        out.println(cal(0, 0, 0));

        out.close();

    }
}