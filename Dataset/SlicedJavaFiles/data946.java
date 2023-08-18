public class Main{	public static void main(String[] args) {
		InputReader in = new InputReader();
		int n = in.nextInt();
		int k = in.nextInt();
		
		long numCandies = 1;
		int turns = 1, add = 2;
		while (numCandies < k) {
			++turns;
			numCandies += add++;
		}
		int res = 0;
		if (numCandies > k) {
			turns += (numCandies-k);
			res += (numCandies-k);
			numCandies = k;
		}
		
		if (turns == n) {
			System.out.println(res);
		}
		else {
			while (turns != n) {
				res += add;
				turns += add++ + 1;
			}
			System.out.println(res);
		}
		
	}
}