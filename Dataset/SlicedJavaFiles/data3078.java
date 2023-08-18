public class Main{	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
         int n=sc.nextInt();
         pw.print(n+n/2);
	pw.close();
	sc.close();
}
}