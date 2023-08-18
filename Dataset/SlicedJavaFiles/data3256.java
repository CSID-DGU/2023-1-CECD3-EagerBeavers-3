public class Main{public static void main(String[] args) throws IOException {
	input.init(System.in);
	PrintWriter out = new PrintWriter(System.out);
	long n = input.nextLong();
	if(n == 1) out.println(5);
	else out.println(25);
	out.close();
}
}