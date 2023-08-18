public class Main{	public static void main(String[] args)
	{
		Scanner sc = new Scanner();
		String entrada = sc.next();
		int mejor = 0;
		for(int i = 0; i < entrada.length(); i++)
		{
			for(int j = i + 1; j <= entrada.length(); j++)
			{
				String sub = entrada.substring(i, j);
				if(KMP_Matcher(sub, entrada))
					mejor = Math.max(j - i, mejor);
			}
		}
		System.out.println(mejor);
	}
}