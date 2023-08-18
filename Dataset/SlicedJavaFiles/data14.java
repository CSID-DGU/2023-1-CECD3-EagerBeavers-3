public class Main{	public static void main(String[] args) {
		int n=nextInt();
		int m=nextInt();
		long b[]=new long[n];
		long g[]=new long[m];
		for(int i=0;i<n;i++)
			b[i]=nextInt();
		for(int i=0;i<m;i++)
			g[i]=nextInt();
		Arrays.sort(b);
		Arrays.sort(g);
		if(b[n-1]>g[0])
			System.out.println("-1");
		else if(b[n-1]==g[0]){
			long sum=0;
			for(int i=0;i<m;i++)
				sum+=g[i];
			for(int i=0;i<n-1;i++){
				sum+=(m*b[i]);
			}
			System.out.println(sum);
		}else{
			long sum=0;
			for(int i=0;i<m;i++)
				sum+=g[i];
			sum+=b[n-1];
			sum+=(b[n-2]*(m-1));
			for(int i=0;i<n-2;i++){
				sum+=(m*b[i]);
			}
			System.out.println(sum);
		}
	}
}