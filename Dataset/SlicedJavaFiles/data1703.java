public class Main{	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int t = in.nextInt() * 2;
		List<Pair> l = new ArrayList<Pair>();
		for (int i = 0; i < n; i++) {
			int c = in.nextInt() * 2;
			int a = in.nextInt();
			l.add(new Pair(c - a, c + a));
		}
		Collections.sort(l);
		int ret = 2;
		for (int i = 1; i < n; i++) {
			if (l.get(i).x - l.get(i-1).y > t)
				ret += 2;
			else if (l.get(i).x - l.get(i-1).y == t)
				ret += 1;
		}
		System.out.println(ret);
	}
}