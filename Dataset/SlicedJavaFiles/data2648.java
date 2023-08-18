public class Main{    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        StringBuilder sb = new StringBuilder();
        int N = sc.nextInt();
        int[] nums = sc.readIntArray(N);
        ArrayList<Integer> num = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            num.add(nums[i]);
        }


        int count = 0;
        while (!num.isEmpty()) {
            count++;
            int size = num.size();
            int min = 200;
            for (int j = size-1; j >=0; j--) {
                if (num.get(j) < min) {
                    min = num.get(j);
                }
            }
            for (int j = size-1; j >=0; j--) {
                int div = num.get(j) / min;
                if ((div * min) == num.get(j)) {
                    num.remove(j);
                }
            }
        }
        sb.append(count);

        System.out.print(sb);
    }
}