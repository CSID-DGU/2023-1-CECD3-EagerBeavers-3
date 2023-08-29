public class Main{	public static void main(String[] args){
		
		//lol what?? If use HashSet timeout, but if use tree set, not?
		//even with super high initialize capacty = 100,000,where max 100000
		Set<Integer> set = new HashSet<Integer>(1000000);
		FastScanner s = new FastScanner();
		n = s.nextInt();
		k = s.nextInt();
		
		int[] a = new int[n];
		for(int i=0; i<n; i++){
			a[i] = s.nextInt();
		}
		Arrays.sort(a);
		
		for(int i=0; i<n; i++){
			if(a[i]%k !=0){
				set.add(a[i]);
			}else{
				if(!set.contains(a[i]/k)){
					set.add(a[i]);
				}
			}
		}
		
		System.out.println(set.size());
	}
}