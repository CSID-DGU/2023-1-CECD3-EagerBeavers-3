public class Main{	public static void main( String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n ; 
		
		n = sc.nextInt();
		a = sc.nextInt();
		b = sc.nextInt();
		
		hm = new HashMap<Integer,Integer>();
		array = new int[n];
		marked = new boolean[n];
		
		for( int i = 0 ; i < n ; ++i )
		{
			array[i] = sc.nextInt();
			hm.put( array[i] , i );
		}
		
		if( a == b)
		{
			boolean flag = true ;
			for( int i = 0 ; i < n ; ++i )
				if( !hm.containsKey( a - array[i]))
					flag = false; 
			
			if( !flag) 
				System.out.println( "NO");
			else
			{
				System.out.println("YES");
				for( int i = 0 ; i < n ; ++i)
					System.out.print("0 ");
			}
		}
		
		else
		{
			
			ans = new int[n];
			
			for( int i = 0 ; i < n ; ++i )
			if( marked[i] ) continue; 
			
			else  // hadle odd , even and single self loops
			{
				if( hm.containsKey(a - array[i]) && !hm.containsKey(b - array[i]))
				{
					propagateA(i);
				}
				
				else if( !hm.containsKey(a - array[i]) && hm.containsKey(b - array[i]))
				{
					// propagate b
					propagateB(i);
				}
				
				else if(!hm.containsKey(a - array[i]) && !hm.containsKey(b - array[i]))
				{
					System.out.println("NO");
					System.exit(0);
				}
			}
			
			
			
			for( int i = 0 ; i < n ; ++i )
				if( marked[i] ) continue; 
				
				else  // handle doule self loops , cycles
				{
						start(i);
				}
			
			System.out.println("YES");
			for( int i = 0 ; i < n; ++i)
				System.out.print(ans[i] + " ");
			System.exit(0);
		}
		
		
		
		
	}
}