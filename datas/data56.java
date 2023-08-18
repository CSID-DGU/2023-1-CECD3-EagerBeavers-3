public class Main{	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Readin();
		stlr[0][0]= bell[0] =1;
		for (int i=1; i<=m; i++)
			for (int j=1;j<=i;j++) {
				stlr[i][j]= (stlr[i-1][j-1]+stlr[i-1][j]*(long)j)%MOD;
				bell[i]= (bell[i]+stlr[i][j])%MOD;
			}
		if (DEBUG)
			for (int i=1; i<=m; i++) cerr.println("Bell["+i+"] ="+bell[i]);
		Arrays.sort(occ);
		if (DEBUG) {
			cerr.println("After Sorting");
			for (int i=0;i<m; i++) cerr.println(occ[i]+" ");}
		long ans=1;
		for (int i=0,j=0; i<m; i=j) {
			for (j=i+1; j<m && occ[i]==occ[j];j++);
			ans= (ans*bell[j-i])%MOD;
		}
		System.out.println(ans);
	}
}