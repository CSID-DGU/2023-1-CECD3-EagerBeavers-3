public class Main{	public static void main (String[] args) throws Exception
	{
		final long mod=(long) (1e9+7);  
		final long mod1=(long) 998244353;
		Reader s=new Reader();
		  PrintWriter pt=new PrintWriter(System.out);
		  
		  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		  int T=s.nextInt();
//		  int T=Integer.parseInt(br.readLine());
//		  int T=1;
		  while(T-->0)
		  {
			  int n=s.nextInt();
			  int arr[]=new int[n];
			  int brr[]=new int[n];
			  int e=-1;
			  for(int i=0;i<n;i++) {
				  arr[i]=s.nextInt();
				  if(e==-1) {
					  brr[e+1]=arr[i];
					  e++;
				  }
				  else {
					  if(arr[i]==1) {
						  e++;
						  brr[e]=arr[i];
					  }
					  else {
						  int j=e;
						  for(j=e;j>=0;j--) {
							  if((arr[i]-1)==brr[j])
								  break;
						  }
						  e=j;
						  brr[e]=arr[i];
					  }
				  }
				  pt.print(brr[0]);
				  for(int j=1;j<=e;j++) {
					  pt.print("."+brr[j]);
				  }
				  pt.println();
			  }
			  
			  
			  
			  
		      
	    	  
		  }
			  
		      
		  
		  pt.close();
	}
}