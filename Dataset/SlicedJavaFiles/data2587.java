public class Main{    public static void main(String[] args) {
        Scanner input = new Scanner();
        StringBuilder output = new StringBuilder();

        int n = input.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }

        Arrays.sort(a);
        boolean[] colored = new boolean[n];
        int colors = 0;
        for (int i = 0; i < n; i++) {
            if (!colored[i]) {
                colors ++;
                colored[i] = true;
                for (int j = i+1; j < n; j++) {
                    if (a[j] % a[i] == 0) {
                        colored[j] = true;
                    }
                }
            }
        }

        System.out.println(colors);
    }
}