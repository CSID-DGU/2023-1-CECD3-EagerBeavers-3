public class Main{    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.valueOf(scanner.nextLine());
        String s = scanner.nextLine();
        int[] arr = Arrays.stream(s.split(" "))
                .mapToInt(Integer::valueOf)
                .toArray();
        int[] prefixSum = new int[n + 1];
        for (int i = 0; i < n; i++) {
            prefixSum[i + 1] = prefixSum[i] + arr[i];
        }
        Map<Integer, List<int[]>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int subarraySum = prefixSum[j + 1] - prefixSum[i];
                map.putIfAbsent(subarraySum, new ArrayList<>());
                int l = i + 1, r = j + 1;
                map.get(subarraySum).add(new int[]{l, r});
            }
        }
        List<int[]> resultPairs = new ArrayList<>();
        for (Map.Entry<Integer, List<int[]>> e : map.entrySet()) {
            List<int[]> result = new ArrayList<>();
            int[] curr = new int[2];
            List<int[]> pairs = e.getValue();
            Collections.sort(pairs, Comparator.<int[]>comparingInt(a -> a[1]));
            for (int[] next : pairs) {
                if (next[0] > curr[1]) {
                    result.add(next);
                    curr = next;
                }
            }
            if (resultPairs.size() < result.size()) {
                resultPairs = result;
            }
        }
        printResult(resultPairs);
    }
}