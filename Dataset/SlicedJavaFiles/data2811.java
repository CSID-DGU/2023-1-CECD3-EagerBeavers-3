public class Main{	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		while(T --> 0) {
			int a = in.nextInt();
			int b = in.nextInt();
			int count = 0;
			
			int[] arr = {a, b};
			Arrays.sort(arr);
			while(arr[0] != 0) {
				count += arr[1] / arr[0];
				arr[1] = arr[1] % arr[0];
				
				Arrays.sort(arr);
			}
			System.out.println(count);
		}
		in.close();
	}
}