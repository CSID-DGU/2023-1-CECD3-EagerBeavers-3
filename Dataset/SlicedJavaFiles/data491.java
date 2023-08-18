public class Main{	public static void main(String[] args) throws IOException 
	{
		Scanner sc = new Scanner();
		PrintWriter pw = new PrintWriter(System.out);
		int n=sc.nextInt();
		ArrayList<String>p=new ArrayList<>();
		ArrayList<String>ne=new ArrayList<>();
		for(int i=0;i<n;i++)
			p.add(sc.nextLine());
		for(int i=0;i<n;i++)
		{	
			String t=sc.nextLine();
			if(p.contains(t))
				p.remove(t);
			else
				ne.add(t);
		}
		Collections.sort(p);
		Collections.sort(ne);
		int ans=0;
		for(int i=0;i<ne.size();i++)
		{
			ans+=sol(ne.get(i),p.get(i));
		}
		System.out.println(ans);
		pw.close();    
	}
}