public class Main{	public static void main(String args[])throws IOException{
		int n = in.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++)
			a[i] = in.nextInt();
		int inv = 0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<i;j++) {
				if(a[j]>a[i])
					inv++;
			}
		}
		inv%=2;
		int q = in.nextInt();
		for(int i=0;i<q;i++) {
			int l = in.nextInt();
			int r = in.nextInt();
			int num = r-l+1;
			inv=(inv+num*(num-1)/2)%2;
			if(inv==0)
				printWriter.println("even");
			else
				printWriter.println("odd");
		}
		closeall();
	}
}