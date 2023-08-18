public class Main{	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		PrintWriter pw=new PrintWriter(System.out);
		int ans=0;
		int n=sc.nextInt(),d=sc.nextInt();
		TreeSet<Integer> set=new TreeSet();
		int []x=new int [n];
		for(int i=0;i<n;i++)
			x[i]=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int x1=x[i]+d;
			if (ok(x,d,x1))
				set.add(x1);
			x1=x[i]-d;
			if (ok(x,d,x1))
				set.add(x1);
			
			
		}
		pw.println(set.size());
			
		
		pw.close();
		
	}
}