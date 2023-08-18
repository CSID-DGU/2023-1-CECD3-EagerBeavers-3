public class Main{	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		
		String[] input = br.readLine().split(" ");
		Item handbag = new Item(Integer.parseInt(input[0]), Integer.parseInt(input[1]));
		
		N = Integer.parseInt(br.readLine()) + 1;
		items = new Item[N];
		for(int n = 1; n < N; n++){
			input = br.readLine().split(" ");
			items[n] = new Item(Integer.parseInt(input[0]), Integer.parseInt(input[1]));
		}		
		items[0] = handbag;
		
		// x << n is a right shift operator 
		// which will remove the last n bits from x
		// Ex 1 << 2 => 4
		bits = new int[1 << N]; // Ex: 1 << 3 = 8; 1 << 5 = 64
		Arrays.fill(bits, -1); // Init bits array to hold -1 values
		
		int ans = solve(1 << 0); // Start solving with bit #1
		pw.println(ans); // Min time needed to put items in handbag
		
		pw.print("0"); // Init output with handbag location
		printOptPath(1 << 0); // Print possible optimum path to pick up items
		
		pw.close();
	}
}