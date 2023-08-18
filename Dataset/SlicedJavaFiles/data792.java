public class Main{	public static void main(String args[]) {
		Kattio sc = new Kattio(System.in);
		int n = sc.getInt();
		String s = sc.getWord();
		int[] found = new int['z' + 1];
		int amount = 0;
		for(int i = 0; i<s.length(); i++) {
			char c = s.charAt(i);
			if(found[c] == 0) amount++;
			found[c]++;
		}
		int contains[] = new int['z' + 1];
		int min = n;
		int start = 0;
		int end = 0;
		int in = 0;
		while(true) {
			if(in<amount) {
				if(end == n) break;
				char c = s.charAt(end);
				if(contains[c] == 0) in++;
				contains[c]++;
				end++;
			} else {
				if(min>end-start) min = end-start;
				char c = s.charAt(start);
				if(contains[c] == 1) in--;
				contains[c]--;
				start++;
			}
		}
		System.out.println(min);


	}
}