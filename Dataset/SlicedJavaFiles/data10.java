public class Main{    public static void main(String args[] ) {
        
        FastReader sc = new FastReader();
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[105];
        
        for(int i=0;i<m;i++){
            int a = sc.nextInt();
            arr[a]++;
        }
        
        for(int i=1;i<=1000;i++){
            int sum=0;
            
            for(int a:arr){
                if(a!=0){
                    sum+=(a/i);
                }
            }
            
            
            if(sum<n){
                System.out.println(i-1);
                return;
            }
            
        }
    }
}