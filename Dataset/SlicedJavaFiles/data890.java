public class Main{	public static void main(String[] args) {
		Parser p = new Parser(System.in);
		PrintWriter pw= new PrintWriter(System.out);

		int n = p.nextInt();
		int k = p.nextInt();

		int[] a = p.nextIntArray(n);
		int [] pos = new int[100001];
		Arrays.fill(pos,-1);
		int cnt = 0;
		for(int i=0; i<n; ++i){
			int e = a[i];
			if( pos[e] == -1 ){
				++cnt;
			}
			pos[e] = i;
			if( cnt == k){
				break;
			}
		}
		if( cnt < k){
			pw.println("-1 -1");
			pw.close();
			return;
		}
		int min = 1000000;
		int max = -1;
		for(int i=0; i<100001; ++i){
			if(pos[i] != -1 && pos[i] < min ){
				min = pos[i];
			}
			if( pos[i] > max){
				max = pos[i];
			}
		}
		++min;
		++max;

		pw.println(min+" "+max);
		pw.close();
	}
}