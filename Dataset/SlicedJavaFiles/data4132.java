public class Main{	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		pw = new PrintWriter(System.out);
		
		bag = new int[2];
		bag[0] = sc.nextInt();
		bag[1] = sc.nextInt();
		
		n = sc.nextInt();
		items = new int[n][2];
		
		for(int i = 0;i<n;i++)
		{
			items[i][0] = sc.nextInt();
			items[i][1] = sc.nextInt();
		}
		
		//System.out.println((items[0][1]-bag[1])*(items[0][1]-bag[1]));
		
		
		mem = new int[1<<n];
		
		Arrays.fill(mem, -1);
		
		pw.println(dp(0));
		trace(0);
		pw.print(0);
		
		pw.flush();
	}
}