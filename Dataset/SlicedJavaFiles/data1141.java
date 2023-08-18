public class Main{	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String[] line = in.readLine().split("\\s+");
		
		long n = Long.parseLong(line[0]);
		
		lim = Long.parseLong(line[1]);
	
		
		long pos = -1;
		
		for(int i=61; i>=0; i--) {
			
			long shift = (long) Math.pow(2, i);
			
			if(pos + shift - sumOfDigits(pos + shift) < lim) {
				pos += shift;
			}
		}
		
		pos++;
		
		if(pos <= n && pos- sumOfDigits(pos) >= lim) {
			System.out.println(n - pos + 1);
		}
		else {
			System.out.println(0);
		}
		
	}
}