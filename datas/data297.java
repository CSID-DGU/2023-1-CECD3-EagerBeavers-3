public class Main{	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int platforms = input.nextInt();
		int in = input.nextInt();
		int[] cols = new int[platforms];
		int[] squares = new int[in];
		
		for (int i = 0; i < in; i ++) {
			squares[i] = input.nextInt();
		}
		
		boolean hi = false;
		int score = 0;
		
		for (int i = 0; i < in; i ++) {
			cols[squares[i] - 1] ++;
			hi = checkscore(cols);
			if (hi == true) {
				hi = false;
				score ++;
				for (int j = 0; j < cols.length; j ++) {
					cols[j] --;
				}
				
			}
			
		}
		
		System.out.println(score);
		
	}
}