public class Main{	public static void main(String[] args) throws IOException
	{
		fis = new FastInputStream(System.in);
		
		System.out.println(solve(fis.nextInt(), fis.nextInt()));
		
		fis.close();
	}
}