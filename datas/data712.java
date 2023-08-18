public class Main{	public static void main(String[] args) {
				
		int n=1;
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in), 50);
		
		try {
			
			n = Integer.valueOf(input.readLine());
			
			if (! ((1 <= n) && (n <= Math.pow(10, 5)))) {
				formatError();
			}
			
			Pattern typeOne = Pattern.compile("^([A-Z]+)([0-9]+)$");
			Pattern typeTwo = Pattern.compile("^R([0-9]+)C([0-9]+)$");
			for (int i=0; i < n; i++) {
				String line = input.readLine();
				Matcher matchOne = typeOne.matcher(line);
				if (matchOne.find()) {
					System.out.println(convertOneToTwo(matchOne.group(2), matchOne.group(1)));
				} else {
					Matcher matchTwo = typeTwo.matcher(line);
					if (matchTwo.find()) {
						System.out.println(convertTwoToOne(matchTwo.group(1), matchTwo.group(2)));
					}
				}
			}
						
		} catch (Exception e) {
			formatError();		
		} 
		
	}
}