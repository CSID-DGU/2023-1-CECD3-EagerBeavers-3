public class Main{    public static void main(String[] args) {
        int n = in.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        Arrays.sort(a);
        int answ = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] != 0) {
                for (int j = i + 1; j < n; j++) {
                    if (a[j] % a[i] == 0) {
                        a[j] = 0;
                    }
                }
                answ++;
                a[i]=0;
            }
        }
        System.out.println(answ);
    }
}