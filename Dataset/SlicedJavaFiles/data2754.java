public class Main{	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		//BufferedReader in = new BufferedReader(new FileReader("lcm.in"));
		n = Integer.parseInt(in.readLine());
		System.out.println(lcm(n));
		in.close();
	}
}