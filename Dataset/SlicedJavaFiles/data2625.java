public class Main{	public static void main(String[] args) {
		MyScanner scan = new MyScanner();
		int n = scan.nextInt();
		int[] elements = new int[n];
		for (int i = 0; i < n; i++)
			elements[i] = scan.nextInt();
		
		int x = 0;
		
		Arrays.sort(elements);
		while(n > 0) {
			x++;
			int[] temp = new int[n];
			int j = 0;
			int size = n;
			int min = elements[0];
			n--;
			for (int i = 1; i < size; i++) {
				if (elements[i]%min == 0) {
					n--;
				}
				else {
					temp[j++] = elements[i];
				}
			}
			
			elements = temp;
		}
		
		out.println(x);
		out.close();
	}
}