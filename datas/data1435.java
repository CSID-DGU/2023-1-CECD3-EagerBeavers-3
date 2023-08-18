public class Main{	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		while(cin.hasNext()) {
			n = cin.nextBigInteger();
			x = cin.nextBigInteger();
			y = cin.nextBigInteger();
			c = cin.nextBigInteger();
			mk[0] = x.subtract(BigInteger.ONE);
			mk[2] = n.subtract(y);
			mk[4] = n.subtract(x);
			mk[6] = y.subtract(BigInteger.ONE);
			mk[1] = mk[0].add(mk[2]).add(BigInteger.ONE);
			mk[3] = mk[2].add(mk[4]).add(BigInteger.ONE);
			mk[5] = mk[4].add(mk[6]).add(BigInteger.ONE);
			mk[7] = mk[6].add(mk[0]).add(BigInteger.ONE);
			BigInteger beg = BigInteger.ZERO, end = mk[0], mid;
			for(int i = 1; i < 8; ++i) if(end.compareTo(mk[i]) < 0) end = mk[i];
			while(beg.compareTo(end) < 0) {
				mid = beg.add(end).shiftRight(1);
				if(solve(mid) == 1) end = mid;
				else beg = mid.add(BigInteger.ONE);
			}
			System.out.println(end);
		}

	}
}