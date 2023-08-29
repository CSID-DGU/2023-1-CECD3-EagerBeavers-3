public class Main{	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		FireAgain fa = new FireAgain();
		Scanner Scan = new Scanner(new FileInputStream("input.txt"));
		fa.out = new PrintStream(new File("output.txt"));
		fa.n = Scan.nextInt();
		fa.m = Scan.nextInt();
		int k = Scan.nextInt();
		fa.arr = new boolean[2001][2001];

		for (int i = 0; i < k; i++) {
			fa.coordinate = new Point();
			fa.coordinate.x = Scan.nextInt();
			fa.coordinate.y = Scan.nextInt();
			fa.q.add(fa.coordinate);
			fa.arr[fa.coordinate.x][fa.coordinate.y] = true;
		}

		fa.bfs(fa.q.peek());

	}
}