public class Main{	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int inv=0;
		int []a=new int [n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		for(int j=0;j<n;j++)
			for(int i=j+1;i<n;i++)
				if(a[j]>a[i])
					inv=1-inv;

		int m=sc.nextInt();
		StringBuilder sb=new StringBuilder();
		while(m-->0)
		{
			int l=sc.nextInt();
			int r=sc.nextInt();
			int s=r-l+1;
			if(s*(s-1)/2%2==1)
				inv=1-inv;
			if(inv==1)
				sb.append("odd\n");
			else
				sb.append("even\n");
		}
		System.out.print(sb);

	}
}