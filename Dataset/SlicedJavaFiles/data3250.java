public class Main{	public static void main(String[] args) throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		BigInteger a = new BigInteger(next());
		System.out.println(BigInteger.valueOf(5).modPow(a, BigInteger.valueOf(100)));
		pw.close();
	}
}