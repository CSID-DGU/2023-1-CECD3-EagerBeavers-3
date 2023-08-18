public class Main{	public static void main(String[] args) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int n = sc.nextInt(), d = sc.nextInt();
		int [] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		TreeSet<Integer> set = new TreeSet<>();
		for (int i = 0; i < a.length; i++) {
			int tmp = a[i] - d;
			if(i == 0 || tmp > a[i-1] && tmp - a[i-1] >= d)
				set.add(tmp);
			tmp = a[i] + d;
			if(i == n-1 || tmp < a[i+1] && a[i+1] - tmp >= d)
				set.add(tmp);
 		}
		out.println(set.size());
		out.flush();
		out.close();
	}
}