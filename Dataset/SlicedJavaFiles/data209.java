public class Main{	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int x=Integer.parseInt(br.readLine());
		int y=Integer.parseInt(br.readLine());
		System.out.print((int)(y%(Math.pow(2, x))));
	}
}