public class Main{    public static void main(String[] args) {
        sc = new FastScanner();
        pw = new PrintWriter(System.out);
 
        int Q = sc.ni();
        for (int q = 0; q < Q; q++) {
            int N = sc.ni();
            int[] nums = sc.intArray(N, 0);
            pw.println(1);
            ArrayDeque<Integer> ad = new ArrayDeque<Integer>();
            ad.push(1);
            for (int i = 1; i < N; i++) {
                if (nums[i]==1) {
                    ad.push(1);
                } else {
                    while (!ad.isEmpty()) {
                        int d = ad.pop();
                        if (d==nums[i]-1) {
                            ad.push(nums[i]);
                            break;
                        }
                    }
                }
                printAD(ad);
            }
        }

        pw.close(); 
    }
}