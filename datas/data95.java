public class Main{	public static void main(String[] args) throws IOException, InterruptedException {
		PrintWriter pw = new PrintWriter(System.out);
		Scanner sc = new Scanner(System.in);
		HashSet<String> hs = new HashSet<String>();
		int[] Arr = new int[14];
		long max = 0;
		for (int i = 0; i < 14; i++) {
			Arr[i] = sc.nextInt();
		}

		for (int i = 0; i < 14; i++) {
			int[] arr = Arr.clone();

			long sum = 0;
			int r = arr[i];
			arr[i] = 0;
			for (int j = i + 1; j < arr.length && r > 0; j++) {
				arr[j]++;
				r--;
			}
			for (int j = 0; j < arr.length; j++) {
				arr[j] +=( r / 14);
				if (j + 1 <= (r % 14)) {
					arr[j]++;
				}
				if (arr[j] % 2 == 0) {
					sum += arr[j];
				}
			}
			max = Math.max(max, sum);

		}
		System.out.println(max);
	}
}