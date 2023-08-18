public class Main{    public static void main(String[] args) throws IOException {
        try (Input input = new StandardInput(); PrintWriter writer = new PrintWriter(System.out)) {
            int n = input.nextInt();
            int[] arr = input.readIntArray(n);

            Arrays.sort(arr);
            int ans =0;
            boolean[] vis = new boolean[n];
            for(int i=0;i<n;i++){
                if(!vis[i]){
                    vis[i]=true;
                    for(int j=i+1;j<n;j++){
                        if(!vis[j] && arr[j]%arr[i]==0){
                            vis[j]=true;                    }
                    }
                    ans++;
                }
            }
            System.out.println(ans);
        }
    }
}