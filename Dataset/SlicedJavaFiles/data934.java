public class Main{	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		long x =sc.nextInt();
		long y =sc.nextInt();
		long m = (-3+Math.round(Math.sqrt(9+8*(x+y))))/2;
		long e = x-m;
		pw.println(e);
		pw.flush();
	}
}