public class Main{	public static void main(String[] args) {
		ori = new Coor(in.nextInt(),in.nextInt());
		n = in.nextInt();
		p = new Coor[n];
		dp = new int[1<<n];
		pre = new Coor[1<<n];
		for (int i = 0;i < n;i++) {
			p[i] = new Coor(in.nextInt(),in.nextInt());
		}
		Arrays.fill(dp,-1);
		dp[0] = 0;
		System.out.println( getdp((1<<n)-1));
		//System.out.printf("%d",0);
		System.out.printf("%d",0);
		trace((1<<n)-1);
		System.out.println();
	}
}