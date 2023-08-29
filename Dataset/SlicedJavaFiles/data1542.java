public class Main{	public static void main(String[] args) throws Exception {
		Parserdoubt3 s = new Parserdoubt3(System.in);
		int n = s.nextInt();
		long k = s.nextInt();
		Long a[] = new Long[n];
		TreeSet<Long> tree = new TreeSet<Long>();
		for (int i = 0; i < a.length; i++) {
			a[i] = s.nextLong();
			tree.add(a[i]);
		}
		Arrays.sort(a);
		
		int ans = 0;
		
		for (int i = 0; i < a.length; i++) {
			if(tree.contains(a[i])){ 
				ans++;
				long next = a[i] * k;
				if(tree.contains(next)) tree.remove(next);
			}
		}
		System.out.println(ans);
	}
}