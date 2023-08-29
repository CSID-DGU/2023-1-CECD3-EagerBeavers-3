public class Main{	public static void main(String args[]) throws IOException {
		int n = sc.nextInt();
		
		int a[]=new int[n];
		
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		
		Arrays.sort(a);
		int c=0;
		for(int i=0;i<n;i++) {
			if(a[i]<0) continue;
			c=c-1;
			for(int j=i+1;j<n;j++) {
				if(a[j]<0) continue;
				if(a[j]%a[i]==0) {
					//System.out.println(a[i]+" : "+a[j]);
					a[j]=c;
				}
			}
			//System.out.println(c);
		}
		System.out.println(Math.abs(c));
	}
}