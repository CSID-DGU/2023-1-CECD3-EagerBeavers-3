public class Main{	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
  		BigInteger bi1 = sc.nextBigInteger();
  		BigInteger bi2 = sc.nextBigInteger();
		BigInteger i,n=bi2;
		BigInteger i2=BigInteger.valueOf(1);
		BigInteger sum=BigInteger.valueOf(0);
		if(bi1.compareTo(bi2)<0){
			System.out.println(0);
			return;
		}
		else if( bi1.compareTo(bi2) == 0 )
		{
			System.out.println(1);
			return;
		}
		bi2=((n.multiply(n.add(BigInteger.valueOf(1)))).divide(BigInteger.valueOf(2))).subtract(n.subtract(BigInteger.valueOf(1)));
		if(bi1.compareTo(bi2)>0)
			System.out.println(-1);
		else{
			System.out.println(bs(BigInteger.valueOf(0),n.add(BigInteger.valueOf(-2)),n,bi1));
		}
  }
}