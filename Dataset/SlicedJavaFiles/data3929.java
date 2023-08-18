public class Main{    public static void main(String[] args) throws IOException {
        Reader sc = new Reader();
        int k = sc.nextInt();
        int[][] buckets = new int[k][];
        long[] bucketSum = new long[k];
        Map<Integer, Integer> map = new HashMap<>(k * 10000);
        long target = 0;
        for (int i = 0; i < k; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
                target += arr[j];
                map.put(arr[j], i);
                bucketSum[i] += arr[j];
            }
            buckets[i] = arr;
        }
        if ((target % k) != 0) {
            System.out.println("No");
            return;
        } else {
            target /= k;
        }

        int[] bitmask = new int[1 << (k )];
        Arrays.fill(bitmask, -1);


        for (int i = 0; i < k; i++) {
            for (int j = 0; j < buckets[i].length; j++) {
                int start = buckets[i][j];
                int next = (int) (target - bucketSum[i]) + start;

                Set<Integer> visited = new HashSet<>();
                Set<Integer> visitedBuckets = new HashSet<>();

                visited.add(start);
                visitedBuckets.add(i);
                int bitset = 1 << i;

                while (map.containsKey(next)) {
                    int bucket = map.get(next);
                    if (start == next) {
                        bitmask[bitset] = start;
                        break;
                    } else if (visited.contains(next)) {
                        break;
                    } else if (visitedBuckets.contains(bucket)) {
                        break;
                    }
                    visited.add(next);
                    visitedBuckets.add(bucket);
                    next = (int) (target - bucketSum[bucket]) + next;
                    bitset |= 1 << bucket;
                }
            }
        }

        boolean[] dp = new boolean[1 << (k ) ];
        Arrays.fill(dp, false);
        int[] build = new int[1 << k];
        Arrays.fill(build, -1);

        for (int i = 0; i < dp.length; i++) {
            dp[i] = bitmask[i] != -1;
        }
        for (int m = 0; m < (1 << k); m++) {
            if (!dp[m]) {
                for (int s = m; s != 0; s = (s - 1) & m) {
                    if (dp[s] && dp[(m ^ s)])   {
                        dp[m] = true;
                        build[m] = s;
                        break;
                    }
                }
            }
        }
        System.out.println(dp[dp.length - 1] ? "Yes" : "No");
        ArrayList<Integer> path = new ArrayList<>();
        rec(path, build, bitmask, (1 << k) - 1);

        int[] picked = new int[k];
        int[] out = new int[k];
        if (dp[dp.length - 1]) {
            for (int i : path) {
                int prev = i;
                int next = (int) (target - bucketSum[map.get(prev)]) + prev;
                picked[map.get(next)] = next;
                out[map.get(next)] = map.get(prev);
                while (next != i) {
                    int t = next;
                    next = (int) (target - bucketSum[map.get(next)]) + next;
                    prev = t;
                    out[map.get(next)] = map.get(prev);
                    picked[map.get(next)] = next;


                }
            }
            for (int i = 0; i < out.length; i++) {
                System.out.println((picked[i]) + " " + (out[i] + 1));
            }
        }
    }
}