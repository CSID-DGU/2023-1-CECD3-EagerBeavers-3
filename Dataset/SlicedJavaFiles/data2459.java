public class Main{	public static void main(String[] args) {																	
	
		Scanner scan = new Scanner(System.in);				

		Map<Long , List<Interval>> map = new HashMap<>();		
		int i , j , n = scan.nextInt() , max = 0;
		long ans = 0;
		for (i = 1;i <= n;i ++) {
			a[i] = scan.nextLong();
		}
		for (i = 1;i <= n;i ++) {
			long sum = 0;
			for (j = i;j <= n;j ++) {				
				sum += a[j];
				if (!map.containsKey(sum)) {
					map.put(sum , new ArrayList<>());
				}
				map.get(sum).add(new Interval(i , j));				
			}
		}
		for (List<Interval> list : map.values()) {
			Collections.sort(list);			
		}		
		for (Map.Entry<Long , List<Interval>> entry : map.entrySet()) {
			int total = getTotal(entry.getValue());
			if (total > max) {
				max = total;
				ans = entry.getKey();				
			}
		}
		solve(map.get(ans));		
	
	}
}