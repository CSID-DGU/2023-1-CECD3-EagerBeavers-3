public class Main{	public static void main(String[] args) throws IOException {
		
		Reader.init(System.in);
		PrintWriter out=new PrintWriter(System.out);
		int n=Reader.nextInt(),t=Reader.nextInt();
		long mod=(long)1e9+7,fact[]=new long[16];
		dp=new long[16][16][16][4];
		for(int i=0;i<16;i++) {
			for(int j=0;j<16;j++) {
				for(int k=0;k<16;k++)
				Arrays.fill(dp[i][j][k], -1);
			}
		}
		fact[0]=1;
		for(int i=1;i<=15;i++) {
			fact[i]=i*fact[i-1];
			fact[i]%=mod;
		}
		NoD[] arr=new NoD[n];
		for(int i=0;i<n;i++) {
			int a=Reader.nextInt(),b=Reader.nextInt();
			arr[i]=new NoD(a,b);
			
		}
		long ans=0;
		for(int i=0;i<(1<<n);i++) {
			int time=0;
			int prev=-1;
			int t1=0,t2=0,t3=0;
			long[] c= {i};
			BitSet b=BitSet.valueOf(c);
			for(int j=0;j<n;j++) {
				if(b.get(j)) {
					time+=arr[j].val;
						prev=arr[j].index;
						if(arr[j].index==1) t1++;
						else if(arr[j].index==2) t2++;
						else t3++;	
				}
			}
			if(time==t) {
				long v=1;
				long v2=1;
				v*=solve(t1,t2,t3,0,mod);
				v%=mod;
				ans+=v;
				ans%=mod;
			}
		}
		out.println(ans);
		out.flush();
		
	}
}