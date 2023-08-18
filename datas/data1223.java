public class Main{	public static void main (String args[]){
		
		Scanner in= new Scanner(System.in);
		long n = in.nextInt();
		long m=in.nextInt();
		long k=in.nextInt();
		
		long x = n-m;
		long y=n/k;
		if(x>=y)
			System.out.println(m);
		else
		{
			long t= y-x;
			long ans=0;
			ans+=k*(pow(t+1)-2);
			ans%=1000000009;
			ans+=m-t*k;
			ans%=1000000009;
			if(ans<0)
				ans+=1000000009;
			System.out.println(ans);
			
		}
			
		
		
	}
}