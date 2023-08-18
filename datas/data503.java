public class Main{	public static void main(String[] args) throws Exception {
		br = new BufferedReader(new InputStreamReader(System.in));
		int n = nextInt();
		int[] arr = {0,1};
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i % 2]);
		}
		System.out.println();
	}
}