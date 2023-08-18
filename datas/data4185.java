public class Main{    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        n = scan.nextInt();

        matrix = new double[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = scan.nextDouble();

        masks = new double[1 << n];
        masks[(1 << n) - 1] = 1;
        for (int i = 0; (1 << i) < (1 << n); i++)
            fillDP(1 << i);

        for (int i = 0; (1 << i) < (1 << n); i++)
            System.out.printf("%.6f ", masks[1 << i]);


    }
}