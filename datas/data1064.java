public class Main{	public static void main(String[] args) throws IOException  {
		BufferedReader inputs = new BufferedReader(new InputStreamReader(System.in));
		
		long indexPosition = Long.parseLong(inputs.readLine());
		
		inputs.close();
		
		//Isolate possible combinations so that all further numbers will have the same length.
		int tenFactor = 0;
		long lowerBound = 1;
		long upperBound = (long) (Math.pow(10, 12));
		long lowerIndexBound = 1;
		long redIndex = 0;
		redIndex += indexPosition;
		
		while(redIndex > 0) {
			redIndex -= (long) (9*Math.pow(10, tenFactor)*(tenFactor + 1));
			if(redIndex <= 0) { //Stage 1: Completed Successfully.
				lowerBound = (long) (Math.pow(10, tenFactor));
				upperBound = (long) (Math.pow(10, tenFactor + 1) - 1);
				break;
			}
			
			lowerIndexBound += (long) (9*Math.pow(10, tenFactor)*(tenFactor + 1));
			tenFactor++;
			
		}
		
		System.out.println(custBinSearch(lowerBound, upperBound, lowerIndexBound, tenFactor, indexPosition));
		
	}
}