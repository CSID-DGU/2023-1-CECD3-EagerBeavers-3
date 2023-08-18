public class Main{	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
		int n = sc.nextInt();
		int k = sc.nextInt();
		long left = 0;
		long right = n;
		long mid = left+right/2;
		while(left<=right) {
			mid = (left+(right))/2;
			if(((mid+1)*mid)/2-(n-mid)==k) {
				pw.println(n-mid);
				pw.close();
				break;
			}
			else if(((mid+1)*mid)/2-(n-mid)>k) {
				right = mid-1;
			}
			else left = mid+1;
		}
	}
}