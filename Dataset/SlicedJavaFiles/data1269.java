public class Main{		public static void main(String[] args) throws IOException 
		{
			Scanner sc=new Scanner(System.in);
			PrintWriter pw=new PrintWriter(System.out);
			long x=sc.nextLong(),k=sc.nextLong();
			if(x==0)
			{
				System.out.println(0);
				return;
			}
			
			if(k==0)
			{
				pw.println((2*x)%mod);
				
				
				pw.close();return;
			}
			
			long ans=2*x-1;
			ans=ans%mod;
			
			long b=powMod(k,2);
			ans=((ans*b)+1)%mod;
			
			
			pw.println(ans);
			
			pw.close();
		
			
		}
}