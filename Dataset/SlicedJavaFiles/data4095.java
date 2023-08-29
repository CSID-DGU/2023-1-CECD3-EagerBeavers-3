public class Main{	public static void main(String[] args)
	{
		int[][] objetos = new int[n][2];
		for(int i = 0; i < n; i++)
		{
			objetos[i][0] = sc.nextInt();
			objetos[i][1] = sc.nextInt();
			distancia[i] = (X - objetos[i][0]) * (X - objetos[i][0]) + (Y - objetos[i][1]) * (Y - objetos[i][1]);
		}
		for(int i = 0; i < n; i++)
			for(int j = 0; j < n; j++)
				distancias[i][j] = (objetos[i][0] - objetos[j][0]) * (objetos[i][0] - objetos[j][0]) + (objetos[i][1] - objetos[j][1]) * (objetos[i][1] - objetos[j][1]);
		int ans = dp((1 << n) - 1);
		System.out.println(ans);
		int current = (1 << n) - 1;
		while(current != 0)
		{
			int next = dpNext[current];
			int differents = next ^ current;
			System.out.print("0 ");
			for(int i = 0; i < n; i++)
				if((differents & (1 << i)) != 0)
					System.out.print((i + 1) + " ");
			current = next;
		}
		System.out.println("0");
	}
}