public class Main{	public static void main(String[] args)
	{
		FastReader fr=new FastReader();

		byte t=fr.nextByte();
		while(t-->0)
		{
			short n=fr.nextShort();
			short a[]=new short [n];
			for (short i=-1;++i<n;)
				a[i]=fr.nextShort();
			
			String s="1";
			System.out.println(s);

			for(short i=0;++i<n;)
			{
				if(a[i]==1)
				{
					s+=".1";
					System.out.println(s);
				}
				else if(a[i]==a[i-1]+1)
				{
					int c=s.lastIndexOf(".");
					s=s.substring(0,c+1)+a[i];
					System.out.println(s);
				}
				else
				{					
					for(;;)
					{
						s=s.substring(0,s.lastIndexOf("."));
						int c=s.lastIndexOf(".");

						int b=Integer.parseInt(s.substring(c+1,s.length()));
						if(b+1==a[i])
						{
							s=s.substring(0,c+1)+a[i];
							System.out.println(s);
							break;
						}
					}
				}
			}
		}
	}
}