public class Main{	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		while(entrada.hasNextInt())
		{
			int n = entrada.nextInt();
			System.out.println(n+(n/2));
		}
	}
}