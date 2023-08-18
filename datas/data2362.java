public class Main{	public static void main(String[] args) {
		// InputStream inputStream = System.in; // Useful when taking input other than
		// console eg file handling // check ctor of inputReader
		// To print in file use this:- out = new PrintWriter("destination of file
		// including extension");

		int n = scn.nextInt(), inv = 0;
		int[] arr = scn.nextIntArr(n);
		for(int i = 0; i < n; i++) {
			for(int j = i + 1; j < n; j++) {
				if(arr[i] > arr[j]) {
					inv++;
				}
			}
		}
		
		int ans = inv % 2;
		
		int m = scn.nextInt();
		while(m-- > 0) {
			int l = scn.nextInt(), r = scn.nextInt();
			
			int change = ((r - l + 1) / 2) % 2;
			
			if(change == 1) {
				ans = 1 - ans;
			}
			
			if(ans == 0) {
				out.println("even");
			} else {
				out.println("odd");
			}
		}
		
		out.close();
	}
}