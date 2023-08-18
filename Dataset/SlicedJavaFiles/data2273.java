public class Main{	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++) {
	char c=s.next().charAt(0);
	if(c=='f')
		a[i]=1;
		
}
int dp[][]=new int[n+1][n+1];
for(int i=0;i<=n;i++) {
	for(int j=0;j<=n;j++)
		dp[i][j]=-1;
}
System.out.println(ans(dp,1,0,a,n));
	}
}