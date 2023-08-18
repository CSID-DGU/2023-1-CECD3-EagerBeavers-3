public class Main{	public static void main(String[] args) throws IOException {
		int Q = readInt();
		while(Q-- > 0) {
			long n = readLong(), m = readLong(), k = readLong();
			if(Math.max(n, m) > k) println(-1);
			else {
				long ans = k;
				if(n%2 != k%2) ans--;
				if(m%2 != k%2) ans--;
				println(ans);
			}
		}
		exit();
	}
}