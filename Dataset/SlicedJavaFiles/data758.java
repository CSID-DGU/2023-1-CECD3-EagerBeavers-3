public class Main{	public static void main(String[] args) throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		n = nextInt();
		int ans = n, cc, cur = 0;
		a = new int [52];
		char[] c = next().toCharArray();
		int l = 0, len = 0;
		for (int i = 0; i < n; ++i) {
			if (Character.isUpperCase(c[i])) {
				cur = 26 + c[i] - 'A';
			} else
				cur = c[i] - 'a';
			if (a[cur] == 0) {
				a[cur]++;
				len++;
				ans = i - l + 1;
			} else {
				a[cur]++;
				for (; l < i; ++l) {
					if (Character.isUpperCase(c[l])) {
						cc = 26 + c[l] - 'A';
					} else
						cc = c[l] - 'a';
					
					if (a[cc] > 1) {
						--a[cc];
					} else break;
				}
				if (i - l + 1 < ans) {
					ans = i - l + 1;
				}
			}
		}
	
		/*int l = 0, r = n - 1;
		for (l = 0; l < n; ++l) {
			if (Character.isUpperCase(c[l])) {
				if (a[26 + c[l] - 'A'] > 1) {
					a[26 + c[l] - 'A']--;
				} else break;
			} else {
				if (a[c[l] - 'a'] > 1) {
					a[c[l] - 'a']--;
				} else break;
				
			}
		}
		for (r = n - 1; r >= 0; --r) {
			if (Character.isUpperCase(c[r])) {
				if (a[26 + c[r] - 'A'] > 1) {
					a[26 + c[r] - 'A']--;
				} else break;
			} else {
				if (a[c[r] - 'a'] > 1) {
					a[c[r] - 'a']--;
				} else break;
				
			}
		}*/
		pw.print(ans);
		pw.close();
	}
}