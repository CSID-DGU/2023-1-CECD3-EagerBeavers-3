public class Main{	public static void main(String args[]) {
		FastScanner in = new FastScanner(System.in);
		
		int n = in.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		if (n % 2 == 0) {
			for (int i = 0; i < n; i++) {
				if (arr[i] >= 0) {
					arr[i] = -1*arr[i]-1;
				}
			}
		}
		else {
			int max = Integer.MIN_VALUE;
			int maxIndex = 0;
			for (int i = 0; i < n; i++) {
				int elem = arr[i];
				if (elem < 0) {
					elem = -1*elem-1;
				}
				if (elem > max) {
					max = elem;
					maxIndex = i;
				}
			}
			for (int i = 0; i < n; i++) {
				if (i == maxIndex) {
					if (arr[i] < 0) {
						arr[i] = -1*arr[i]-1;
					}
				}
				else {
					if (arr[i] >= 0) {
						arr[i] = -1*arr[i]-1;
					}
				}
			}
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n ;i++) {
			sb.append(arr[i] + " ");
			
		}
		System.out.println(sb);

	}
}