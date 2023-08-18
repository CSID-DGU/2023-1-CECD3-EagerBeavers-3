public class Main{	public static void main (String[] args) throws IOException{
		int n = f.nextInt();
		int[] a = io(n);
		HashMap<Integer,ArrayList<ivl>> hm = new HashMap<>();
		for (int i=0;i<n;i++) {
			int sum = 0;
			for (int j=i;j<n;j++) {
				sum+=a[j];
				if (hm.get(sum)==null) hm.put(sum,new ArrayList<ivl>());
				hm.get(sum).add(new ivl(i,j));
			}
		}
		HashSet<ivl> hs = new HashSet<ivl>();
		
		for (ArrayList<ivl> arr : hm.values()) {
			Collections.sort(arr,new comp());
			HashSet<ivl> temp = new HashSet<ivl>();
			temp.add(arr.get(0));
			int lastr = arr.get(0).r;
			int num = 1;
			for (ivl curr:arr) {
				if (curr.l>lastr) {
					lastr = curr.r;
					num++;
					temp.add(curr);
				}
			}
			if (temp.size()>hs.size()) hs = temp;
		}
		
		System.out.println(hs.size());
		for (ivl curr:hs) {
			System.out.println((curr.l+1)+" "+(curr.r+1));
		}
    }
}