public class Main{	public static void main(String[] args) throws IOException {
		
		Reader scan = new Reader();
		int t = scan.nextInt();
		for(int tt = 0;tt<t;tt++) {
			
			int n = scan.nextInt();
			int arr[] = new int[n];
			for(int i = 0;i<n;i++) arr[i] = scan.nextInt();
			
			List<Integer> list = new ArrayList<>();
			int j = -1;
			StringBuilder s = new StringBuilder();
			for(int i = 0;i<n;i++) {
				if(list.isEmpty() || arr[i]==1) { //add
					list.add(arr[i]);
					j++;
				}
				else if(arr[i] == list.get(j)+1) { //replace
					list.set(j, arr[i]);
				}
				else {
					for(int k = j;k>=0;k--) {
						if(arr[i] == list.get(k)+1) {//replace
							list.set(k, arr[i]);
							break;
						}
						else {//delete
							list.remove(k);
							j--;
						}
					}
				}
				s.delete(0, s.length());
				for(Integer p:list) {
					s.append(p+".");
				}
				s.deleteCharAt(s.length()-1);
				System.out.println(s.toString());
			}
		}

		scan.close();
		
	}
}