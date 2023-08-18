public class Main{	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long l = in.nextLong();
		long r = in.nextLong();
		in.close();
		if (r - l < 2) {
			System.out.println(-1);
			return;
		}
		if ((r - l > 2)||(l%2 ==0 )) {
			long s = l + l%2;
			System.out.println(s+" "+(s+1)+" "+(s+2));
		} else {
			if (l%2 == 1) {
				System.out.println(-1);
			} else{
				long s = l;
				System.out.println(s+" "+(s+1)+" "+(s+2));
			}
		}
		
	}
}