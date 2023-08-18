public class Main{    public static void main(String[] Args){
        FastReader scan=new FastReader();
        int n=scan.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=scan.nextInt();
        }
        Arrays.sort(arr);
        boolean[] done=new boolean[n];
        int ans=0;
        for(int i=0;i<n;i++){
            if(!done[i]){
                done[i]=true;
                ans++;
                for(int j=i+1;j<n;j++){
                    if(arr[j]%arr[i]==0){
                        done[j]=true;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}