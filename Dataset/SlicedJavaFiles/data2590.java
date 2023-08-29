public class Main{    public static void main(String[] args) throws IOException{
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new PrintStream(System.out));
        int n=Integer.parseInt(f.readLine());
        StringTokenizer st=new StringTokenizer(f.readLine());
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int ans=0;
        boolean[]used=new boolean[n];
        for(int i=0;i<n;i++){
            if(!used[i]){
                ans++;
                for(int j=i+1;j<n;j++){
                    if(!used[j] && arr[j]%arr[i]==0){
                        used[j]=true;
                    }
                }
                used[i]=true;
            }
        }
        System.out.print(ans);
        f.close();
        out.close();
    }
}