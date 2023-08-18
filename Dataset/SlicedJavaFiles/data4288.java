public class Main{    public static void main(String[] args) throws Exception {
        int i,j,k;
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        A = Integer.parseInt(st.nextToken());
        
        needed = N/2+1;
        
        b = new int[N];
        l = new int[N];
        dl = new double[N];
        
        for (i=0;i<N;i++) {
            
            st = new StringTokenizer(br.readLine());
            b[i] = Integer.parseInt(st.nextToken());
            l[i] = Integer.parseInt(st.nextToken());
            dl[i] = ((double)l[i])/100.0;
            
        }
        
        base = new int[8];
        base[0] = 1;
        for (i=1;i<N;i++) {
            base[i] = base[i-1]*2;
        }
        
        best = 0.0;
        
        giveCandies(0, K);
        
        DecimalFormat df = new DecimalFormat("0.0000000000");
        
        String rs = df.format(best);
        String mrs = "";
        
        for (i=0;i<rs.length();i++) {
            if (rs.charAt(i) == ',') {
                mrs += '.';
            } else {
                mrs += rs.charAt(i);
            }
        }
        
        System.out.println(mrs);
        
        
        
    }
}