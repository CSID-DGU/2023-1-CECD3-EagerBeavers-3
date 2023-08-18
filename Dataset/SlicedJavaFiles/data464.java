public class Main{	public static void main(String[] args) throws Exception
	{
		int n=ni();
		Map<String, Integer> hola=new HashMap<String,Integer>();
		hola.put("S", 0);
		hola.put("XS", 0);
		hola.put("XXS", 0);
		hola.put("XXXS", 0);
		hola.put("M", 0);
		hola.put("L", 0);
		hola.put("XL", 0);
		hola.put("XXL", 0);
		hola.put("XXXL", 0);
		for(int i=0; i<n; i++)
		{
			String te=ns();
			hola.put(te,hola.get(te)+1);
		}
		for(int i=0; i<n; i++)
		{
			String te=ns();
			hola.put(te,hola.get(te)-1);
		}
		int ans=0;
		for(int te:hola.values())
		{
			ans+=max(te,0);
		}
		pr(ans);
		System.out.print(output);
	}
}