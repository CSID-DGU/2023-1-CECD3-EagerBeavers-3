public class Main{	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		int k = input.nextInt();

		long ate = n - binSearchPuts(n, k);
		System.out.println(ate);
	}
}