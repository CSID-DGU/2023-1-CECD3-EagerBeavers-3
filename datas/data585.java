public class Main{    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = sc.nextInt();
        int d = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]+d);
            set.add(arr[i]-d);
        }

        int cnt = 0;
        for (int loc: set) {
            int minDist = (int)2e9;
            for (int i = 0; i < n; i++) {
                minDist = Math.min(minDist, Math.abs(arr[i]-loc));
            }

            if(minDist == d)
                cnt++;
        }

        pw.println(cnt);

        pw.flush();
        pw.close();
    }
}