public class Main{	public static void main(String[] args)
	{
		Scanner sc = new Scanner();
		int a = sc.nextInt();
		int b = sc.nextInt();
		nFilas = Math.max(a, b);
		nColumnas = Math.min(a, b);
		dp = new byte[1 << nColumnas][1 << nColumnas][1 << nColumnas][nFilas + 1][nColumnas + 1];
		for(byte[][][][] i : dp)
			for(byte[][][] j : i)
				for(byte[][] k : j)
					for(byte[] l : k)
						Arrays.fill(l, Byte.MAX_VALUE);
		System.out.println(dp((1 << nColumnas) - 1, 0, 0, 0, 0));
	}
}