public class Main{	public static void main(String[] args){
		FastScanner scan = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		int n = scan.nextInt();
		long[] a = scan.nextLongArray(n);
		BigInteger res = BigInteger.ZERO;
		for (int i = n-1; i >= 0; i--) res = res.add(BigInteger.valueOf(i*a[i] - (n-1-i)*a[i]));
		HashMap<Long, Long> map = new HashMap<>();
		for(int i = 0; i < n; i++) {
			res = res.subtract(BigInteger.valueOf(map.getOrDefault(a[i]-1, 0L)));
			res = res.add(BigInteger.valueOf(map.getOrDefault(a[i]+1, 0L)));
			map.put(a[i], map.getOrDefault(a[i], 0L)+1);
		}
		out.println(res);
		out.close();
	}
}