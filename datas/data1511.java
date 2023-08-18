public class Main{	public static void main(String[] args) throws IOException {
		InputReader in = new InputReader();
		l = in.nextLong();
		r = in.nextLong();
		dp = new long[65][2][2][2][2];
		for(int i = 0 ; i < 65;i++)
		for(int j = 0 ; j < 2;j++)
		for(int k = 0 ; k < 2;k++)
		for(int a = 0 ; a<2;a++)
		dp[i][j][k][a][0]=dp[i][j][k][a][1]=-1;
		System.out.println(go(63, 0, 0, 0, 0));
	}
}