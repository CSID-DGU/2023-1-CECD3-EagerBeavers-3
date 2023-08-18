public class Main{	public static void main(String[] args) throws IOException 
	{ 
		Reader s=new Reader(); 
		int n = s.nextInt(), i, j, ans=0;
		int[] a = new int[101];
		for(i=0;i<n;i++){
			a[s.nextInt()]++;
		}
		for(i=1;i<=100;i++){
			if(a[i]>0){
				ans++;
				for(j=i;j<=100;j++){
					if(j%i==0){
						a[j]=0;
					}
				}
			}
		}
		System.out.println(ans);
	} 
}