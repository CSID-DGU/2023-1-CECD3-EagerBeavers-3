public class Main{	public static void main(String[] args) {
		MyScanner sc = new MyScanner();
		int n = sc.nextInt();
		Integer[] a = new Integer[n];
		for(int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		Arrays.sort(a);
		boolean[] b = new boolean[n];
		int ans = 0;
		for(int i = 0; i < n; i++)
			if(!b[i]) {
				ans++;
				for(int j = i + 1; j < n; j++)
					if(a[j] % a[i] == 0)
						b[j] = true;
			}
		out.println(ans);
		out.close();
	}
}