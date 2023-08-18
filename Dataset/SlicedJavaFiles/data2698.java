public class Main{	public static void main(String[] args) throws IOException {
 
		int n = in.nextInt();
		int[] a = in.nextIntArray(n);
		Arrays.sort(a);
		boolean[] color = new boolean[n];
		int cnt = 0;
		for(int i = 0; i < n; ++i) {
			if(!color[i]) {
				cnt++;
				for(int j = i; j < n; j++) {
					if(a[j] % a[i] == 0)
						color[j] = true;
				}
			}
		}
		System.out.println(cnt);
		
		out.close();
	}
}