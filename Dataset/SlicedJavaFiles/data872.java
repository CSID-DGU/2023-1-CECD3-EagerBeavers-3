public class Main{	public static void main(String[] args) throws Exception {
		time = System.currentTimeMillis();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		a = new int[n];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) 
			a[i] = Integer.parseInt(st.nextToken());
		int end = end();
		if(end < 0) System.out.println("-1 -1");
		else System.out.println((start(end) + 1) + " " + (end + 1));
		br.close();
		System.exit(0);
	}
}