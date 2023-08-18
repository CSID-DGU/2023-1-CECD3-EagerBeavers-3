public class Main{	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		s = sc.next();
		int size = 1;
		while(size <= N) size*=2;
		val = new long[size*2];
		setup(0,N-1,0);

		long toFind = query(0,N-1,0,N-1,0);
		long ans = 1L<<29;
		for(int i = 0; i < N; i++)
			ans = Math.min(ans,binarySearch(i,toFind));
		System.out.println(ans);
	}
}