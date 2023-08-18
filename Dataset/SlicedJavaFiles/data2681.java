public class Main{    public static void main(String args[])throws IOException{
    	int i,j;
        br = new BufferedReader(new InputStreamReader(System.in));
        int n=nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
            a[i]=nextInt();
        Arrays.sort(a);
        int l=0;
        for(i=0;i<n;i++){
            if(a[i]!=-1){
                int p=a[i];
                for(j=i;j<n;j++){
                    if(a[j]%p==0)
                        a[j]=-1;
                }
                l++;
            }
        }
        pw.println(l);
        pw.close();
    }
}