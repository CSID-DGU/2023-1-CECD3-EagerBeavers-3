public class Main{	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] arr = sc.nextIntArr(n);
			Stack<Integer> st = new Stack<Integer>();
			st.add(arr[0]);
			print(st, pw);
			for (int i = 1; i < n; i++) {
				if (arr[i] == 1) {
					st.add(arr[i]);
				} else {
					while (st.peek() != arr[i] - 1) {
						st.pop();
					}
					st.pop();
					st.add(arr[i]);
				}
				print(st, pw);
			}
		}
		pw.close();
	}
}