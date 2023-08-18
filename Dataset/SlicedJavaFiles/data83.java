public class Main{	public static void main(String[] args) {
		FastScanner in = new FastScanner(System.in);
		int N = in.nextInt();
		Stack<Integer> stack = new Stack<>();
		for(int i = 0; i < N; i++) {
			int num = in.nextInt() % 2;
			if(stack.size() >= 1 && stack.lastElement() == num)
				stack.pop();
			else
				stack.add(num);
		}
		
		System.out.println(stack.size() <= 1 ? "YES" : "NO");
	}
}