public class Main{    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] in = sc.nextLine().split(" ");
        int n = Integer.parseInt(in[0]);
        int t = Integer.parseInt(in[1]);

        int[] coor = new int[n];
        int[] side = new int[n];

        for (int i = 0; i < n; i++) {
            in = sc.nextLine().split(" ");
            coor[i] = Integer.parseInt(in[0]);
            side[i] = Integer.parseInt(in[1]);
        }

        quickSort(coor, 0, n - 1, side);

        int count = 2;
        double dist;
        for (int i = 0; i < n - 1; i++) {
            dist = (coor[i + 1] - coor[i]) - (double)(side[i + 1] + side[i]) / 2.0;
            if (dist > t) {
                count += 2;
            } else if (dist == t) {
                count += 1;
            }
        }

        System.out.println(count);

    }
}