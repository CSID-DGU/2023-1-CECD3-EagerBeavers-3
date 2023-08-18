public class Main{	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner();
		PrintWriter out=new PrintWriter(System.out);
		n=sc.nextInt();
		m=sc.nextInt();
		a=new int [n][m];
		for(int i=0;i<n;i++)
			for(int j=0;j<m;j++)
				a[i][j]=sc.nextInt();
		Min=new int [n][n];
		if(n==1) {
			int lo=0,hi=(int)1e9;
			int ans=0;
			while(lo<=hi) {
				K=lo+hi>>1;
				
				if(check(0, 0))
				{
					ans=K;
					lo=K+1;
				}
				else
					hi=K-1;
			}
			System.out.println(ans);
			return;
		}
		for(int i1=0;i1<n;i1++)
			for(int i2=0;i2<n;i2++)
			{
				if(i1==i2)
					continue;
				int min=(int) 1e9;
				for(int j=0;j<m;j++)
					min=Math.min(Math.abs(a[i1][j]-a[i2][j]), min);
				Min[i1][i2]=min;
			}
		memo=new int [n][1<<n];
		int ans=0;
		int lo=0,hi=(int)1e9;
		while(lo<=hi) {
			K=lo+hi>>1;
		for(int []x:memo)
			Arrays.fill(x, -1);
		int ok=0;
		for(int top=0;top<n && ok==0;top++)
			for(int bottom=0;bottom<n && ok==0 ;bottom++) {
				bot=bottom;
				if(top==bottom || !check(top, bottom))
					continue;
				
				
				int dp=dp(1<<top | 1<<bottom, 2, top);
				ok|=dp;
				
			}
		if(ok==1)
		{
			ans=K;
			lo=K+1;
			
		}
		else
			hi=K-1;
		}
		out.println(ans);
		
		out.close();

	}
}