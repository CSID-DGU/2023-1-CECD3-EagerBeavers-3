public class Main{	public static void main(String args[]) throws IOException {
		tok = new StringTokenizer(in.readLine());
		int n = Integer.parseInt(tok.nextToken());
		
		int tab[] = new int[n]; 
		tok = new StringTokenizer(in.readLine());
		for (int i=0; i<n; i++)
			tab[i] = Integer.parseInt(tok.nextToken());
		
		int inversions = countInversions(tab);
		boolean isOdd = inversions % 2 == 1;
		
		tok = new StringTokenizer(in.readLine());
		int k = Integer.parseInt(tok.nextToken());
		
		int start, end, len;
		
		for (int i=0; i<k; i++)	{
			tok = new StringTokenizer(in.readLine());
			start = Integer.parseInt(tok.nextToken());
			end = Integer.parseInt(tok.nextToken());
			
			len = (end - start + 1) % 4;
			if (len == 2 || len ==3)
				isOdd = !isOdd;
			
			out.println(isOdd ? "odd" : "even");
		}
		
		out.close();
		
	}
}