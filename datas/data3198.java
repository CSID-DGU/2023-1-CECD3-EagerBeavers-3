public class Main{	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(n);
		try {
			String s = Integer.toString(n);
			s = s.substring(0, s.length() - 1);
			set.add(Integer.parseInt(s));
		} catch (Exception e) {
		}
		try {
			String s = Integer.toString(n);
			s = s.substring(0, s.length() - 2) + s.charAt(s.length() - 1);
			set.add(Integer.parseInt(s));
		} catch (Exception e) {
		}
		System.out.println(max(set));
	}
}