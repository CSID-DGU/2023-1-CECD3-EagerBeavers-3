public class Main{	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		if (((n % 4) == 0) || ((n % 7) == 0) || ((n % 44) == 0) || ((n % 47) == 0) || ((n % 74) == 0) || ((n % 77) == 0) || ((n % 444) == 0) || ((n % 447) == 0) || ((n % 474) == 0) || ((n % 477) == 0) || ((n % 744) == 0) || ((n % 747) == 0) || ((n % 774) == 0) || ((n % 777) == 0))
			System.out.print("YES");
		else
			System.out.print("NO");
		in.close();
	}
}