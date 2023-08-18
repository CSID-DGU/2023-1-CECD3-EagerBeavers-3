public class Main{	public static void main(String[] args) {
		try (final Scanner sc = new Scanner(System.in)) {
			final int N = sc.nextInt();
			int[] array = new int[N];
			for(int i = 0; i < N; i++){
				array[i] = sc.nextInt() - 1;
			}
			
			long inv = 0;
			BIT bit = new BIT(N);
			for(int i = 0; i < N; i++){
				inv += bit.sum(array[i], N);
				bit.add(array[i], 1);
			}
			//System.out.println(inv);
			
			int mod2 = (int)(inv % 2);
			final int M = sc.nextInt();
			for(int i = 0; i < M; i++){
				final int l = sc.nextInt() - 1;
				final int r = sc.nextInt() - 1;
				
				final long size = (r - l) + 1;
				if(size > 1){
					//System.out.println(size + " " + ((size * (size - 1) / 2)));
					if((size * (size - 1) / 2) % 2 == 1){
						mod2 = 1 - mod2;
					}
				}
				
				System.out.println((mod2 == 0) ? "even" : "odd");
			}
		}
	}
}