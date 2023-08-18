public class Main{    public static void main(String[] args)throws IOException {
        FastReader in=new FastReader(System.in);
        int t=in.nextInt();
        StringBuilder sb=new StringBuilder();
        int i,j,tc=0;
        while(tc++<t) {
            int n=in.nextInt();
            int arr[]=new int[n];
            for(i=0;i<n;i++)
                arr[i]=in.nextInt();
            int ans[]=new int[n+4];
            ans[0]=1;
            int pos=0;
            sb.append("1\n");
            for(i=1;i<n;i++){
                if(arr[i]==arr[i-1]+1){
                    ans[pos]=ans[pos]+1;
                }
                else if(arr[i]==1){
                    pos++;
                    ans[pos]=1;
                }
                else{
                    while(ans[pos]!=arr[i]-1)
                        pos--;
                    ans[pos]=ans[pos]+1;
                }
                for(j=0;j<=pos;j++){
                    if(j<pos)
                        sb.append(ans[j]).append(".");
                    else
                        sb.append(ans[j]).append("\n");
                }

            }
        }
        System.out.println(sb);
    }
}