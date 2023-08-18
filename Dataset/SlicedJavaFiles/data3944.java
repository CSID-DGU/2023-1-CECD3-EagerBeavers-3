public class Main{	public static void main(String[]args) throws Exception
	{
			int n=ni();
			double ke=ni();
			boolean[][]a=new boolean[n][n];
			for(int i=0; i<n; i++)
				for(int j=0; j<n; j++)
					a[i][j]=ni()==0;
			int left=n/2;
			int[]ldp=new int[1<<left];
			int[]rdp=new int[1<<(n-left)];
			int[]pow=new int[25];
			pow[0]=1;
			for(int i=1; i<25; i++)
				pow[i]=pow[i-1]<<1;
			for(int i=0; i<pow[left]; i++)
				ou:for(int j=0; j<left; j++)
					if((i>>j)%2==0)
					{
						int te=i;
						for(int k=0; te>0; k++,te>>=1)
							if(a[j][k]&&(te&1)!=0)
							{
								ldp[i+pow[j]]=max(ldp[i+pow[j]],ldp[i]);
								continue ou;
							}
						ldp[i+pow[j]]=max(ldp[i+pow[j]],ldp[i]+1);
					}
			int right=n-left;
			for(int i=0; i<pow[right]; i++)
				ou:for(int j=0; j<right; j++)
					if((i>>j)%2==0)
					{
						int lul=j+left;
						int te=i;
						for(int k=left; te>0; k++,te>>=1)
							if(a[lul][k]&&(te&1)!=0)
							{
								rdp[i+pow[j]]=max(rdp[i+pow[j]],rdp[i]);
								continue ou;
							}
						rdp[i+pow[j]]=max(rdp[i+pow[j]],rdp[i]+1);
					}
			int maxi=0;
			for(int i=0; i<pow[left]; i++)
			{
				int lol=0;
				int te=i;
				for(int j=0; te>0; j++,te>>=1)
					if((te&1)!=0)
						for(int k=0; k<right; k++)
							if(a[j][k+left])
								lol|=pow[k];
				maxi=max(maxi,ldp[i]+rdp[pow[right]-1-lol]);
			}
			pr((ke*ke*(maxi-1))/(2*maxi));
		System.out.println(output);
	}
}