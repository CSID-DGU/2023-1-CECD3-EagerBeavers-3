public class Main{	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		ArrayList<Integer> listCount = new ArrayList<Integer>();
		listCount.add(1);
		boolean justf = false;
		int p = 1000000007;
		long ans = 0;
		
		for(int x=0; x<n; x++){
			String next = sc.nextLine();
			
			if(next.equals("f")){
				
				if(justf){
					listCount.add(0);
				}
				else{
					
					for(int i=1; i<listCount.size(); i++){
						int sum = (listCount.get(i-1) + listCount.get(i)) % p;
						listCount.set(i, sum);
					}
					
					listCount.add(0);
				}
				
				justf = true;
			}
			else{ // "s"
				if(justf){
					justf = false;
				}
				else{
					for(int i=1; i<listCount.size(); i++){
						int sum = (listCount.get(i-1) + listCount.get(i)) % p;
						listCount.set(i, sum);
					}
				}
			}
			
			//System.out.println(listCount);
		}
		
		for(int i=0; i<listCount.size(); i++){
			ans += listCount.get(i);
		}
		
		System.out.print((ans % p));
	}
}