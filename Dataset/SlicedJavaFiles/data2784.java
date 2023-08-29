public class Main{	public static void main(String[] args) {
		int n=0, a, b;
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		try {
			n = Integer.parseInt(stdin.readLine());
		} catch (IOException e) {
		}
		while(n-->0){
			String[] row = null;
			try {
				row = stdin.readLine().split(" ");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			a = Integer.parseInt(row[0]);
			b = Integer.parseInt(row[1]);
			if(a<b) System.out.println(calc(a,b));
			else System.out.println(calc(b,a));
		}
	}
}