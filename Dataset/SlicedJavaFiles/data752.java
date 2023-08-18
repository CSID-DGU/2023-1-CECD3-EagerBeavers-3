public class Main{	public static void main(String[] args) throws Exception {
		FastScanner in = new FastScanner();
		PrintWriter pw = new PrintWriter(System.out);
		
		int n = in.nextInt();
		char[] s = in.next().toCharArray();
		freq = new HashMap<Character, Integer>();
		for(int i = 0; i < n; i++) {
			char c = s[i];
			if(!freq.containsKey(c))
				freq.put(c, 0);
		}
		
		int k = freq.size();
		int l = 0, r = 0, best = n;
		inc(s[0]);
		
		while(r < n) {
			if(unique == k) { // got all, move left
				best = Math.min(best, r+1-l);
				dec(s[l++]);
			}
			else { // advance r
				if(++r == n)
					break;
				inc(s[r]);
			}
		}
		
		pw.println(best);
		
		pw.flush();
		pw.close();
	}
}