public class Main{	public static void main(String[] args) throws IOException {
		int n = in.nextInt();
		int[] a = in.nextIntArray(n);
		sort(a);
		int ans = 0;
		boolean[] done = new boolean[n];
		for(int i = 0; i < n; i ++) {
			if(done[i])
				continue;
			ans ++;
			for(int j = i + 1; j < n; j ++)
				if(a[j] % a[i] == 0)
					done[j] = true;
		}
		out.write(ans + "\n");
		out.flush();
	}
}