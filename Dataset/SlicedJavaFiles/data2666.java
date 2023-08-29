public class Main{	public static void main(String[] args) throws Exception {
		MScanner sc=new MScanner(System.in);
		PrintWriter pw=new PrintWriter(System.out);
		int n=sc.nextInt();HashSet<Integer>nums=new HashSet<Integer>();
		int[]in=new int[n];for(int i=0;i<n;i++)in[i]=sc.nextInt();
		Arrays.sort(in);
		int ans=0;
		boolean vis[]=new boolean[n];
		for(int i=0;i<n;i++) {
			if(vis[i])continue;
			for(int j=i+1;j<n;j++) {
				if(in[j]%in[i]==0) {
					vis[j]=true;
				}
			}
			ans++;
		}
		pw.println(ans);
		
		pw.flush();
	}
}