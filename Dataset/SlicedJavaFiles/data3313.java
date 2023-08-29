public class Main{		public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		Point [] square = new Point [4] ; 
		Point [] rotSquare = new Point[4] ; 
		
		for(int i = 0 ; i < 4 ;i++)
			square[i] = new Point(sc.nextInt() , sc.nextInt());
		
		for(int i = 0 ; i < 4 ;i++)
			rotSquare[i] = new Point(sc.nextInt() , sc.nextInt());
		
		boolean can = false ; 
		
		for(int x = -100 ; x <= 100 ; x++)
			for(int y = -100 ; y <= 100 ; y++)
				can |= inside(new Point(x , y), square) & inside(new Point (x , y), rotSquare);
				
			
		
		
		out.println(can ? "YES" : "NO");
		
		out.flush();
		out.close();

	}
}