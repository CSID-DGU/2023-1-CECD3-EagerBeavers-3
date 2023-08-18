public class Main{	public static void main(String[] args) throws Exception {

		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int[]a=sc.nextIntArray(n);
			LinkedList<Integer>ll=new LinkedList<Integer>();
			for(int i=0;i<n;i++) {
				if(a[i]==1) {
					ll.addLast(a[i]);
				}else if(ll.isEmpty()) {
					ll.addLast(a[i]);
					
				}else {
					while(!(ll.getLast()==a[i]-1)) {
						ll.removeLast();
					}
					ll.removeLast();
					ll.addLast(a[i]);
				}
				int ii=0;
				for(int j:ll) {
					pw.print(j);
					if(ii!=ll.size()-1){
						pw.print('.');
					}
					ii++;
				}
				pw.println();
			}
			
		}
		
		
		
		
		pw.close();
	}
}