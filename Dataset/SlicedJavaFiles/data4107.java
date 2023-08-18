public class Main{	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		int xS=sc.nextInt(),yS=sc.nextInt();
		n=sc.nextInt();
		x=new int [n+1];
		y=new int [n+1];
		x[0]=xS;y[0]=yS;
		for(int i=1;i<=n;i++)
		{	
			x[i]=sc.nextInt();
			y[i]=sc.nextInt();
		
		}	
		memo=new int [1<<(n+1)];
		Arrays.fill(memo,-1);
		sb=new StringBuilder();

		sb.append(dp(0)+"\n");
		print(0);
		sb.append("0");
		System.out.println(sb);
	}
}