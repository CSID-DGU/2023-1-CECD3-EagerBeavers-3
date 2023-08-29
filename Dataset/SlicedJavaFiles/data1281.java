public class Main{	public static void main(String[] args) throws IOException {
		BigInteger x=in.RB(),k=in.RB();
		if(k.equals(BigInteger.ZERO))System.out.println(x.multiply(tow).mod(mod));
		else if(x.equals(BigInteger.ZERO))System.out.println(0);
		else {
			BigInteger x1=tow.multiply(x).subtract(BigInteger.ONE);
			x1=x1.mod(mod);
			BigInteger x2=pow(tow,k);
			x2=x2.mod(mod);
			System.out.println(x1.multiply(x2).add(BigInteger.ONE).mod(mod));
			
		}
	}
}