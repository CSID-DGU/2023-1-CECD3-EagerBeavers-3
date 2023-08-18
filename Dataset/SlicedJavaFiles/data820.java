public class Main{	public static void main(String[] args)
	{
		Scanner lee = new Scanner(System.in);	

		for(int i=2; i*i<=MAX; i++)
		{
		    if(!P.get(i))
		    {
		    	for(int j=i+i; j<=MAX; j+=i)
		    		P.set(j);
		    }
		}
		
		int n, k, c;
		
		n = lee.nextInt();
		k = lee.nextInt();
		
		c = 0;
		
		for(int i=2; i<=n; i++)
		{
			if(Noldbach(i))
				c++;
			
			if(c == k)
				break;
		}
		
		if(c == k)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}