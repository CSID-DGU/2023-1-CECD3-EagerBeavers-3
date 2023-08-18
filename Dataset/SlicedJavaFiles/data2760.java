public class Main{	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long a = in.nextLong();
		if (a % 2 == 0) {
			long result = cal(a);
			result = Math.max(result, cal(a + 1));
			result = Math.max(result, cal2(a));
			System.out.println(Math.max(result, a));
		}

		else {
			long result = (a - 1) * (a - 2) * (a - 0);
			System.out.println(Math.max(result, a));
		}
	}
}