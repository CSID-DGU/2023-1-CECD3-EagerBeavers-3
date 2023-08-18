public class Main{	public static void main(String[] args) throws Exception {
		
		int n = nextInt();
		int a = nextInt();
		int b = nextInt();
		int[] tasks = new int[n];
		for(int i = 0; i < n; i++){
			tasks[i] = nextInt();
		}
		Arrays.sort(tasks);
		exit(tasks[b] - tasks[b-1]);
		
	}
}