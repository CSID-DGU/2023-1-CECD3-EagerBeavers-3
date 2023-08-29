public class Main{	public static void main(String[] args)throws Throwable {
		MyScanner sc=new MyScanner();
		PrintWriter pw=new PrintWriter(System.out);
		
		int n=sc.nextInt();
		int r=sc.nextInt();
		int [] x=new int [n];
		for(int i=0;i<n;i++)
			x[i]=sc.nextInt();
		double [] ans=new double [n];
		ans[0]=r;
		for(int i=1;i<n;i++){
			ans[i]=r;
			for(int j=0;j<i;j++){
				double dx=Math.abs(x[i]-x[j]);
				if(dx>2*r)
					continue;
				double y=Math.sqrt((4*r*r)-(dx*dx));
				ans[i]=Math.max(ans[i], ans[j]+y);
			}
		}
		
		
		for(double z : ans)
			pw.print(z+" ");
		pw.flush();
		pw.close();
	}
}