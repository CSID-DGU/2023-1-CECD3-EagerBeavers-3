public class Main{	public static void main(String[] args) {
		 FastReader sc = new FastReader();
		 int n = sc.nextInt();
		 int[] a = new int[n];
		 TreeSet<Integer> set = new TreeSet<Integer>();
		 for(int i=0;i<n;++i) {
			 a[i] = sc.nextInt();
			 set.add(a[i]);
		 }
		 long ans = 0;
		 while(set.size() > 0) {
			 ++ans;
			 int min = set.first();
			 TreeSet<Integer> temp = new TreeSet<>();
			 for(int x : set) {
				 if(x%min != 0) temp.add(x);
			 }
			 set = temp;
			 
		 }
		 out.print(ans);
		 
		 out.close();
	}
}