public class Main{			public static void main(String[] args)
			{
				InputReader in = new InputReader(System.in);
				PrintWriter pw = new PrintWriter(System.out);

				int n = in.nextInt();
				long U = in.nextLong();
				long[] E = new long[n];
				double max = -1;
				
				for(int i=0;i<n;i++)
					E[i] = in.nextLong();
				
				for(int k=1;k<n-1;k++)
				{
					int i = k + 1, j = n - 1, mid = 0;
					double T = 0;
					
					while(i < j)
					{
						mid = (int)Math.ceil((double)(i+j)/2);
						
						if(E[mid] - E[k-1] <= U)
							i = mid;
						else
							j = mid - 1;
					}
					
					j = k;
					k = i;
					i = j - 1;
					
					T = E[k] - E[j];
					T /= E[k] - E[i];
					
					if(E[k] - E[i] <= U)
						max = Math.max(max, T);
					
					k = j;
				}	
				
				pw.println(max);
				
				pw.flush();
				pw.close();
			}
}