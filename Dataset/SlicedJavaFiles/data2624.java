public class Main{	public static void main(String[] args) throws Exception {
		FastScanner sc = new FastScanner();
		PrintWriter pw = new PrintWriter(System.out);
		int n = sc.nextInt();
		Integer[] arr = new Integer[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		int ct = 0;
		boolean[] ar = new boolean[n];
		for(int i=0;i<n;i++) {
			if(!ar[i]) {
				ar[i]=true;
				ct++;
				int x = arr[i];
				for(int j=0;j<n;j++) {
					if(arr[j]%x==0) {
						ar[j]=true;
					}
				}
			}
		}
		
		pw.println(ct);
		pw.close();
	}
}