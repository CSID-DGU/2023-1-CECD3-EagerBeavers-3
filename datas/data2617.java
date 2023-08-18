public class Main{	public static void main (String args[]) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		String s1=br.readLine();
		String[] s=s1.split(" ");
		int a[] = new int[n];
		for(int i = 0;i<n;i++)
		{
			a[i]=Integer.parseInt(s[i]);
		}
		Arrays.sort(a);
		System.out.println(findColour(a,n));
	}
}