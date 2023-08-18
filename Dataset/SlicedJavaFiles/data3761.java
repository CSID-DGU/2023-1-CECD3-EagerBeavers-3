public class Main{	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
		FastScanner sc = new FastScanner();
		FastOutput out = new FastOutput(System.out);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int k=sc.nextInt();
		int ans[][][]=new int[n][m][11];
		int arr[][]=new int[n*m][4];
		for(int i=0;i<n;i++){
			for(int j=0;j<m-1;j++){
				int x=sc.nextInt();
				arr[i*m+j][3]=x;
				arr[i*m+j+1][2]=x;
			}
		}
		for(int i=0;i<n-1;i++){
			for(int j=0;j<m;j++){
				int x=sc.nextInt();
				arr[i*m+j][1]=x;
				arr[(i+1)*m+j][0]=x;
			}
		}
		if(k%2==1){
			for(int i=0;i<n;i++){
				StringBuilder sb=new StringBuilder("");
				for(int j=0;j<m;j++){
					ans[i][j][10]=-1;
					sb.append(ans[i][j][10]+" ");
				}
				out.println(sb.toString());
			}
		}else{
			
			for(int ceng=1;ceng<=k/2;ceng++){
				for(int i=0;i<n;i++){
					for(int j=0;j<m;j++){
						ans[i][j][ceng]=Integer.MAX_VALUE/3;
						for(int dr=0;dr<4;dr++){
							int nx=i+dir[dr][0];
							int ny=j+dir[dr][1];
							if(nx<n&&ny<m&&nx>=0&&ny>=0){
								ans[i][j][ceng]=Math.min(ans[i][j][ceng], ans[nx][ny][ceng-1]+arr[i*m+j][dr]);
							}
						}
					}
				}
			}
			for(int i=0;i<n;i++){
				StringBuilder sb=new StringBuilder("");
				for(int j=0;j<m;j++){
					sb.append(ans[i][j][k/2]*2+" ");
				}
				out.println(sb.toString());
			}
		}
		out.close();
	}
}