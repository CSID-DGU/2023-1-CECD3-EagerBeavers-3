public class Main{	public static void main(String[] args) throws Exception{
		br = new BufferedReader(new InputStreamReader(System.in));
		ans = new int[8];
		int n = Integer.parseInt(br.readLine());
		System.out.println("?"+"1 1 "+n+" "+n);
		System.out.flush();
		int q = Integer.parseInt(br.readLine());
		cut(n);
		System.out.print("! ");
		for(int i=0 ; i<8 ; i++)	System.out.print(ans[i]+" ");
		System.out.println();
	}
}