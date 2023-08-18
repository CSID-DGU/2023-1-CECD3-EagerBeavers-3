public class Main{	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		long n = sc.nextLong(), s = sc.nextLong();
		create(UPPER, n);
		long ans = 0;
		for(int sod = 1; sod <= 162; ++sod)
		{
			create(LOWER, s + sod);
			prepMemo(sod);
			ans += dp(63, 0, sod);
		}
		
		
		out.println(ans);
		out.close();
	}
}