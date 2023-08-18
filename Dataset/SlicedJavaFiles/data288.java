public class Main{    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] heat = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            heat[i] = Integer.parseInt(st.nextToken());
        }
        max = 0;
        pre = new int[n + 1];
        pre[0] = 0;
        for(int i = 0; i < n; i++){
            pre[i + 1] = pre[i] + heat[i];
        }
        for(int i = k; i <= n; i++){
            findIntensity(i);
        }
        System.out.println(max);
    }
}