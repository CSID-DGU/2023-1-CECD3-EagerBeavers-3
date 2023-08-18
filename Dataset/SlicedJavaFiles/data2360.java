public class Main{	public static void main(String[] args) throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		//int qq = 1;
		int qq = Integer.MAX_VALUE;
		//int qq = readInt();
		for(int casenum = 1; casenum <= qq; casenum++)	{
			int n = readInt();
			int[] l = new int[n];
			for(int i = 0; i < n; i++) {
				l[i] = readInt();
			}
			int ret = 0;
			for(int i = 0; i < n; i++) {
				for(int j = i+1; j < n; j++) {
					if(l[i] > l[j]) {
						ret++;
					}
				}
			}
			int qqq = readInt();
			while(qqq-- > 0) {
				int a = readInt();
				int b = readInt();
				int d = b-a;
				ret ^= d*(d+1)/2;
				pw.println(ret%2 == 0 ? "even" : "odd");
			}
		}
		exitImmediately();
	}
}