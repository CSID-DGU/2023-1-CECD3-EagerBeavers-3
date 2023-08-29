public class Main{		public static void main(String[] args)
		{
			InputReader in = new InputReader(System.in);
			PrintWriter pw = new PrintWriter(System.out);
			
			//Code starts..
		
			
			
			
			
			
			int n = in.nextInt();
			long d = in.nextInt();
			long[] a = new long[n];
			for(int i=0; i<n; i++)
				a[i] = in.nextLong();
			
			
			int ans = 0;
			//ans++;
			HashSet<Long> set = new HashSet<>();
			/*set.add(a[0]-d);
			if(Math.abs(a[0]+d-a[1])>=d)
			{
				ans++;
				set.add(a[0]+d);
			}
			
			*/
			for(int i=1; i<n; i++)
			{
				
				//pw.println(a[i]+" "+a[i-1]);
				
				long dis = (long) Math.abs(a[i]-a[i-1]);
				//pw.println(dis);
				if(dis==2*d)
					ans++;
				
				if(dis-(long)2*d>0)
					ans += 2;
				
				
			}
			pw.println(ans+2);
			
			
			
			
			
			
			//Code ends....
			
			pw.flush();
			pw.close();
		}
}