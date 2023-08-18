public class Main{	public static void main(String[] args)
	{
		FastScanner in = new FastScanner(System.in);
		String[] sizes = {"XXXS", "XXS", "XS", "S", "M", "L", "XL", "XXL", "XXXL"};
		int n = in.nextInt();
		HashMap<String, Integer> a = new HashMap<>();
		HashMap<String, Integer> b = new HashMap<>();
		for (String s : sizes) {
			a.put(s, 0);
			b.put(s, 0);
		}
		for (int i = 0; i < n; i++) {
			String s = in.next();
			a.put(s, a.get(s) + 1);
		}
		for (int i = 0; i < n; i++) {
			String s = in.next();
			b.put(s, b.get(s) + 1);
		}
		for (String s : sizes) {
			int cut = Math.min(a.get(s), b.get(s));
			a.put(s, a.get(s) - cut);
			b.put(s, b.get(s) - cut);
		}
		int changes = 0;
		for (String s : sizes)
			changes += a.get(s);
		System.out.println(changes);
	}
}