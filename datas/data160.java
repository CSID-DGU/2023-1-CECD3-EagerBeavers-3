public class Main{    public static void main(String[] args) throws Exception{
        FastReader sc=new FastReader(); 
        OutputStream outputStream = System.out;
        PrintWriter out = new PrintWriter(outputStream);
        int n=sc.nextInt();
        int[] font=new int[n];
        int[] cost=new int[n];
        for(int i=0;i<n;i++) {
            font[i]=sc.nextInt();
        
        }
        for(int i=0;i<n;i++) {
            cost[i]=sc.nextInt();
        }
        int[] dou= new int[n];
        for(int i=0;i<n;i++) {
            int min=Integer.MAX_VALUE;
            for(int j=0;j<i;j++) {
                if(font[j]<font[i]) {
                    if(min>cost[i]+cost[j]) {
                        min=cost[i]+cost[j];
                    }
                }
            }
            dou[i]=min;
        }
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<n;i++) {
            int min=Integer.MAX_VALUE;
            for(int j=0;j<i;j++) {
                if(dou[j]!=Integer.MAX_VALUE && font[j]<font[i]) {
                    if(min>dou[j]+cost[i]) {
                        min=dou[j]+cost[i];
                    }
                }
            }
            if(min<ans) {
                ans=min;
            }
        }
        if(ans==Integer.MAX_VALUE) {
            System.out.println(-1);
        }
        else {
            System.out.println(ans);
        }
    }
}