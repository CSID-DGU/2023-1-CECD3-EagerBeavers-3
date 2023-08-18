public class Main{    public static void main(String args[]) throws Exception {
        pr = new PrintWriter(System.out);
        scan = new Scanner(System.in);
        br = new BufferedReader(new InputStreamReader(System.in));
        int n = inputInt();
        //char[] c = br.readLine().toCharArray();
        int[] a = new int[n];
        int[] b = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){

            a[i]=Integer.parseInt(st.nextToken());
            //b[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(a);
        int ans=0;
        for(int i=0;i<n;i++){
            if(b[i]!=1){
                ans++;
                for(int j=i;j<n;j++){
                    if(a[j]%a[i]==0){
                        b[j]=1;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}