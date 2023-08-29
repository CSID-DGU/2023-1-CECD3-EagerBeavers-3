public class Main{	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int counter = 0;
			int numbCottages = scan.nextInt();
			int t = scan.nextInt();
			House[] cottages = new House[numbCottages];
			for(int i =0; i<numbCottages; i++){
				int centre = scan.nextInt();
				int length = scan.nextInt();
				double beginning = centre - ((double)length)/2;
				double end = centre + ((double)length)/2;
				cottages[i]= new House(beginning, end);
				
			}
			
			Arrays.sort(cottages);
			
			//check righthand side of first cottage
			
			/*
			if(cottages[0].end + t < cottages[1].beginning)
				counter++;
			//check lefthand side of last cottage
			
			if(cottages[numbCottages-1].beginning -t > cottages[numbCottages-2].end)
				counter++;
				
				*/
			
			for(int i =0; i<numbCottages-1; i++){
				
				if(cottages[i].end + t <= cottages[i+1].beginning){
					counter++;
//					System.out.println(counter + "left hand");
				}
				
				if (cottages[i+1].beginning - t >= cottages[i].end){
					counter++;
//					System.out.println(counter + "right hand");
				}
				
				if (Math.abs((cottages[i].end + t - cottages[i+1].beginning)) < 1e-8){
					counter--;
					
					
				}
				
	
			}
			
			System.out.println(counter+2);
			
		}
	}
}