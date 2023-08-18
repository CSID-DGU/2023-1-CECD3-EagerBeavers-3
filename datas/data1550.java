public class Main{    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = in.readLine().split(" ");
        int n = i(arr[0]);
        long k = i(arr[1]);
        long[] A = new long[n];
        arr = in.readLine().split(" ");
        for(int i=0; i<n; i++)
            A[i] = i(arr[i]);
        shuffle(A);
        Arrays.sort(A);

        Set<Long> BAN = new HashSet<Long>();
        int ans = 0;
        for(int i=0; i<n; i++) {
            if(!BAN.contains(A[i])) {
                ans++;
                BAN.add(A[i]*k);
            }
        }
        System.out.println(ans);
    }
}