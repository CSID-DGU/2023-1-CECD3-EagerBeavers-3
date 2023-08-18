public class Main{    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] A = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            A[i] = in.nextInt();
            sum += A[i];
        }
        Arrays.sort(A);
        int cnt = 0;
        int temp = 0;
        for (int i = n - 1; i >= 0; i--) {
            temp += A[i];
            sum -= A[i];
            cnt++;
            if (temp > sum)
                break;
        }
        System.out.println(cnt);
    }
}