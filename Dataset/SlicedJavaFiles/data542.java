public class Main{	public static void main(String[] args) {
		FastScanner fs=new FastScanner();
		int T=fs.nextInt();
		for (int tt=0; tt<T; tt++) {
			int n=fs.nextInt();
			boolean isEven=n%2==0;
			while (n%2==0) n/=2;
			if (isSquare(n) && isEven) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
	}
}