public class Main{	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			
			int n = sc.nextInt();
			BigInteger m = sc.nextBigInteger();
			
			System.out.println(m.mod(BigInteger.valueOf(2).pow(n)));
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}