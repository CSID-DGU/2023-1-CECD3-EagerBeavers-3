public class Main{	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());	
		int n=Integer.parseInt(st.nextToken());
		int m=Integer.parseInt(st.nextToken());
		String a="";
		String b="";
		for(int i=0;i<1129;i++) {
			a+="1";
			b+="8";
		}
		a+="9";
		b+="1";
		
		System.out.println(a);
		System.out.println(b);
	}
}