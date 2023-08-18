public class Main{    public static void main(String[] args) {
        // TODO code application logic hereSc
        int n, i;
        boolean status = false;
        int answer;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int a[] = new int[n];
        for (i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        Arrays.sort(a);
        answer = a[0];
        for (i = 1; i < n; i++) {
            if (a[i] != answer) {
                answer = a[i];
                status = true;
                i = n + 1;
            }
        }
        if (status) {
            System.out.println(answer);
        } else {
            System.out.println("NO");
        }
    }
}