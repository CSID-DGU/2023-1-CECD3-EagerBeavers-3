public class Main{    public static void main(String[] args) throws IOException {
        int n=enter.nextInt();
        int m=enter.nextInt();
        long k=enter.nextLong();
        arr=new long[n+1];
        for (int i = 1; i <n+1 ; i++) {
            arr[i]=enter.nextLong();
        }
        long[] summ=new long[n+1];
        for (int i = 1; i <n+1 ; i++) {
            summ[i]+=arr[i]+summ[i-1];
        }

        long[] best=new long[n+1];

        for (int i = 1; i <n+1 ; i++) {
            best[i]=Math.max(0, ((i-m>=0) ? best[i-m]+summ[i]-summ[i-m]-k:0));
        }
        long ans=best[1];

        for (int i = 1; i <n+1 ; i++) {
            ans=Math.max(ans,best[i]);
            for (int j = 1; j <m ; j++) {
                ans=Math.max(ans, ((i-j>=0) ? best[i-j] -k +summ[i]-summ[i-j]:0));
            }
        }
        System.out.println(ans);
    }
}