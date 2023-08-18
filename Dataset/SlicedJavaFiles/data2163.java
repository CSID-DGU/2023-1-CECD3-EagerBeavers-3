public class Main{    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner();
        PrintWriter out = new PrintWriter(System.out);

        int N = sc.nextInt(), R = sc.nextInt();
        double answer[] = new double[N];
        int[] x = new int[N];

        for (int i = 0; i < N; i++)
            x[i] = sc.nextInt();

        for (int i = 0; i < N; i++) {
            answer[i] = R;
            for (int j = 0; j < i; j++) {
                int dist = Math.abs(x[i] - x[j]);
                if(dist <= 2 * R) {
                    double t = answer[j] + Math.sqrt(4 * R * R - dist * dist);
                    answer[i] = Math.max(answer[i], t);
                }
            }
        }
        for(int i = 0; i < N; ++i)
            out.print(answer[i] + " ");

        out.println();

        out.flush();
        out.close();
    }
}