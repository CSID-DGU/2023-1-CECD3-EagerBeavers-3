public class Main{	public static void main (final String[] args) throws IOException {
		//goal is to always be higher
		Set<Integer> poss = new HashSet<>();
		for (int i = 1; 2 * (i*i) <= 1000000000; ++i) {
			poss.add(2 * (i*i));
			poss.add(4 * (i*i));
		}
		int t = si();
		for (int i = 0; i < t; ++i) {
			int n = si();
			if (poss.contains(n)) System.out.println("YES");
			else System.out.println("NO");
		}
	}
}