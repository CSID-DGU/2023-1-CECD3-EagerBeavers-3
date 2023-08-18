public class Main{	public static void main(String[] args) throws IOException {
		int n = nextInt();
		int[] a = intArray(n);
		
		long s = 0;
		for (int x : a)
			s += x;
		
		long m = 0;
		for (int i = 0; i < n; i++) {
			m += a[i];
			if (m*2 >= s) {
				System.out.println(i+1);
				return;
			}
		}
	}
}