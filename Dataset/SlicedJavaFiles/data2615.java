public class Main{    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        //Scanner sc = new Scanner(System.in);
        sb = new StringBuilder();
        N = sc.nextInt();
        A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        Arrays.sort(A);
        B = new boolean[N];
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            if(B[i]) {
                continue;
            }
            else {
                count++;
                B[i] = true;
            }
            for (int j = i + 1; j < A.length; j++) {
                if(A[j] % A[i] == 0) {
                    B[j] = true;
                }
            }
        }
        sb.append(count);
        System.out.println(sb);
    }
}