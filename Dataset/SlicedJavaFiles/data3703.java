public class Main{	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner();
		PrintWriter out = new PrintWriter(System.out);
		n=sc.nextInt();
		int []fac=new int [n+1];
		t=new int [n];
		g=new int [n];
		int []cnt=new int [3];
		fac[0]=1;
		for(int i=1;i<=n;i++)
			fac[i]=(int) (i*1L*fac[i-1]%MOD);
		int T=sc.nextInt();
		for(int i=0;i<n;i++) {
			t[i]=sc.nextInt();
			g[i]=sc.nextInt()-1;
			cnt[g[i]]++;
			
		}
		memo1=new int [n][cnt[0]+1][T+1];
		memo2=new int [n][cnt[1]+1][cnt[2]+1][T+1];
		memo3=new int [4][cnt[0]+1][cnt[1]+1][cnt[2]+1];
		for(int i=0;i<n;i++) {
			for(int j=0;j<=cnt[0];j++) 
				Arrays.fill(memo1[i][j], -1);
			for(int j=0;j<=cnt[1];j++) 
				for(int k=0;k<=cnt[2];k++)
					Arrays.fill(memo2[i][j][k], -1);
			
		}
		for(int i=0;i<4;i++)
			for(int j=0;j<=cnt[0];j++)
				for(int k=0;k<=cnt[1];k++)
					Arrays.fill(memo3[i][j][k], -1);
		int ans=0;
		for(int cnt0=0;cnt0<=cnt[0];cnt0++)
			for(int sum0=0;sum0<=T;sum0++)
				for(int cnt1=0;cnt1<=cnt[1];cnt1++)
					for(int cnt2=0;cnt2<=cnt[2];cnt2++) {
						long ways= dp1(0,cnt0,sum0)*1L*dp2(0,cnt1,cnt2,T-sum0)%MOD;
						ways=ways*dp3(cnt0,cnt1,cnt2,3)%MOD;
						ways*=fac[cnt0];
						ways%=MOD;
						ways*=fac[cnt1];
						ways%=MOD;
						ways*=fac[cnt2];
						ways%=MOD;
						ans+=ways;
						if(ans>=MOD)
							ans-=MOD;
					}
		out.println(ans);
		out.close();

	}
}