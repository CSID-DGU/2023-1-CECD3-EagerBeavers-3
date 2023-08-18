public class Main{    public static void main(String[] args) throws IOException {
        FastScanner sc = new FastScanner();
        int N = sc.nextInt();
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
        	nums[i] = sc.nextInt();
        }
        Arrays.sort(nums);
        boolean[] hit = new boolean[N];
        int colors = 0;
        int index = 0;
        while (index < N) {
        	if (hit[index] == false) {
        		colors++;
        		int div = nums[index];
        		for (int i = index; i < N; i++) {
        			if (nums[i] % div == 0) {
        				hit[i] = true;
        			}
        		}
        	}
        	index++;
        }
        System.out.println(colors);
    }
}