public class Main{    public static void main(String[] args) throws IOException {
        int n=sc.nextInt();
        int[] arr=new int[101];
        for(int i=0;i<n;i++)
            arr[sc.nextInt()]++;
        boolean [] vis=new boolean[101];
        int c=0;
        for(int i=1;i<=100;i++){
            if(!vis[i]&&arr[i]>0){
                c++;
                for(int j=i+i;j<=100;j+=i)
                    vis[j]=true;
            }
        }
        pw.println(c);
        pw.flush();
    }
}