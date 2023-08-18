public class Main{    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split("\\s");
        int N = Integer.parseInt(s[0]);
        int K = Integer.parseInt(s[1]);
        s = br.readLine().split("\\s");
        int[] arr = new int[N];
        for(int i=0;i<N;++i) arr[i] = Integer.parseInt(s[i]);
        solve(N,K,arr);   
    }
}