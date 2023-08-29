public class Main{  public static void main(String[] args){
    FastScanner sc = new FastScanner();
    int n = sc.nextInt();
    String nStr = Integer.toString(n);

    String nStr1 = nStr.substring(0, nStr.length() - 1);
    String nStr2 = nStr.substring(0, nStr.length() - 2) + nStr.charAt(nStr.length() - 1);

    int result = Math.max(n, Integer.parseInt(nStr1));
    result = Math.max(result, Integer.parseInt(nStr2));
    System.out.println(result);
  }
}