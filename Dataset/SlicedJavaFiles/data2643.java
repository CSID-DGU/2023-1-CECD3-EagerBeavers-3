public class Main{    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int c[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int count = 1;
        c[0] = 1;
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] % arr[j] == 0) {
                    c[i] = c[j];
                    break;
                }
            }
            if (c[i] == 0) {
                c[i] = count + 1;
                count++;
            }
        }
        System.out.println(count);
    }
}