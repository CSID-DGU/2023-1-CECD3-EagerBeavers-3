public class Main{	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long n = Long.parseLong(st.nextToken());
		long s = Long.parseLong(st.nextToken());
		long posible = binarySearch(n,s);
		long dig, answer;
		long i, cmed;
		for (i = posible; i >= 0; i--) {
			dig = 0;
			cmed = i;
			while (cmed > 0) {
				dig = dig+cmed%10;
				cmed/=10;
			}
			if (i-dig < s) {
				break;
			}
		}
		answer = n-i;
		System.out.println(answer);
	}
}