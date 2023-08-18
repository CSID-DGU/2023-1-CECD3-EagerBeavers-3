public class Main{	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		k = 0;
		
		String line = sc.nextLine();
		
		ArrayList<Character> poks = new ArrayList<Character>();
		boolean ex[] = new boolean[256];
		
		for(int i=0; i<n; i++)
		{
			if(!ex[line.charAt(i)])
			{
				ex[line.charAt(i)] = true;
				poks.add(line.charAt(i));
			}
		}
		
		
		int l = 0;
		int r = 0;
		int dist = 1;
		int occ[] = new int[256];
		occ[line.charAt(0)] = 1;
		
		int min = n;
		while(r < n)
		{
			if(dist == poks.size())
				min = Math.min(min, r - l + 1);
			if(l < r && dist == poks.size())
			{
				
				occ[line.charAt(l)]--;
				if(occ[line.charAt(l)] == 0)
					dist--;
				l++;
				continue;
			}
			if(r < n-1){
				occ[line.charAt(r+1)]++;
				if(occ[line.charAt(r+1)] == 1)
					dist++;
			}
			r++;
		}
		System.out.println(min);
		
	}
}