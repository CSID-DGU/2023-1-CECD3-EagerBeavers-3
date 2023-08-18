public class Main{	public static void main(String[] args) throws IOException {
		FastScanner fs=new FastScanner(System.in);
		int j = fs.nextInt();
		ArrayList<Integer> a =new ArrayList<Integer>();
		for(int i=0;i<j;i++) {
			a.add(fs.nextInt());
		}
		Collections.sort(a);
		Collections.reverse(a);
		int c=0;
		while(a.size()!=0) {
			int f=a.get(a.size()-1);
			c+=1;
			for(int q=a.size()-1;q>-1;q--)
			if(a.get(q)%f==0) {
				a.remove(q);
			}
		}
		System.out.println(c);
		}
}