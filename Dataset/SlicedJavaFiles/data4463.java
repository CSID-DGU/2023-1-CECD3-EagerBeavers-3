public class Main{	public static void main(String[] args) throws Exception{
		pw=new PrintWriter(System.out);
		sc = new MScanner(System.in);
		int tc=sc.nextInt();
		while(tc-->0) {
			n=sc.nextInt();m=sc.nextInt();
			
			int[]maxInCol=new int[m];
			in=new int[m][n+1];
			
			for(int i=0;i<n;i++) {
				for(int j=0;j<m;j++) {
					in[j][i]=sc.nextInt();
					maxInCol[j]=Math.max(maxInCol[j], in[j][i]);
					in[j][n]=j;
				}
			}
			Arrays.sort(in,(x,y)->maxInCol[y[n]]-maxInCol[x[n]]);
			
			
			memo=new int[n][1<<n];
			sumOfMask=new int[n][1<<n];
			maxMask=new int[n][1<<n];
			for(int i=0;i<n;i++) {
				for(int msk=0;msk<memo[i].length;msk++) {
					memo[i][msk]=-1;
					if(i>=m)continue;
					for(int bit=0;bit<n;bit++) {
						if(((msk>>bit)&1)!=0) {
							sumOfMask[i][msk]+=in[i][bit];
						}
					}
				}
			}
			for(int col=0;col<n;col++) {
				for(int msk=0;msk<(1<<n);msk++) {
					int curMask=msk;
					for(int cyclicShift=0;cyclicShift<n;cyclicShift++) {
						maxMask[col][msk]=Math.max(maxMask[col][msk], sumOfMask[col][curMask]);
						
						int lastBit=curMask&1;
						curMask>>=1;
						curMask|=(lastBit<<(n-1));
						
					}
				}
			}
			pw.println(dp(0, 0));
		}
		
		
		pw.flush();
	}
}