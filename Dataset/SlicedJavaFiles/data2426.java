public class Main{	public static void main(String[] args) throws IOException
	{
		in=new InputReader(System.in);
		w=new PrintWriter(System.out);
		 int n=ni();
		 int[] a=na(n);
		 int ans=0;
		 for(int i=0;i<n;i++)
		 {
			 for(int j=i+1;j<n;j++)
			 {
				 if(a[j]<a[i])
					 ans++;
			 }
		 }
		 int m=ni();
		 ans=ans%2;
		 while(m-->0)
		 {
			 int l=ni(),r=ni();
			 int range=r-l+1;
			 range=range*(range-1)/2;
			 range=range%2;
			 ans=(ans+range)%2;
			 if(ans==1)
				 w.println("odd");
			 else
				 w.println("even");
		 }
       w.close();
    }
}