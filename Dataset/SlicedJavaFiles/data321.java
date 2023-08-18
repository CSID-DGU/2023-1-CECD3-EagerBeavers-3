public class Main{	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int n=sc.nextInt();
		int []a=new int [n];
		int max=0;
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		Stack<Integer> s=new Stack<>();
		boolean f=true;
				for(int i=0;i<n;i++) {
					max=Math.max(max,a[i]);
					if(!s.isEmpty() && a[i]>s.peek())
						f=false;
					s.push(a[i]);
					while(!s.isEmpty()) {
						int high=s.pop();
						if(s.isEmpty() || s.peek()!=high) {
							s.push(high);
							break;
						}
						s.pop();
					}
				//	System.out.println(s+" "+max);
				}
				//System.out.println(f+" "+max);
				if(f && s.size()==0)
					out.println("YES");
				else if(f && s.size()==1 && s.peek()==max)
					out.println("YES");
				else
					out.println("NO");
		 out.flush();
	}
}