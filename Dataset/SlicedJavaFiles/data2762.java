public class Main{	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		long n = scan.nextLong();
		TaskA t = new TaskA();
		System.out.println(t.solve(n));
	}
}