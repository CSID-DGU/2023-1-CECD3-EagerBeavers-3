public class Main{  public static void main(String[] args) {
    try(BufferedReader in = new BufferedReader(new InputStreamReader(System.in))){
      String[] str = in.readLine().split(" ");
      BigInteger n = new BigInteger(str[0]);
      BigInteger s = new BigInteger(str[1]);

      BigInteger left = BigInteger.ONE;
      BigInteger right = new BigInteger(n.toString()).add(BigInteger.TEN);

      BigInteger TWO = BigInteger.ONE.add(BigInteger.ONE);

      BigInteger t;

      while(right.subtract(left).compareTo(BigInteger.ONE)>0){
        t = left.add(right.subtract(left).divide(TWO));
        if(check(t, s)){
          right = t;
        }else{
          left = t;
        }
      }
      BigInteger result = n.subtract(right).add(BigInteger.ONE);
      if (result.compareTo(BigInteger.ZERO)<=0) {
        System.out.println(0);
      }else{
        System.out.println(result);
      }

    }catch (IOException e) {
      e.printStackTrace();
    }
  }
}