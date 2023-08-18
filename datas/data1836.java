public class Main{    public static void main(String Args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int n=Integer.valueOf(st.nextToken());
        int m=Integer.valueOf(st.nextToken());
        int k=Integer.valueOf(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int sock[] = new int[n];
        
        for (int i=0;i<n;i++){
            sock[i]= Integer.valueOf(st.nextToken());
        }
        Arrays.sort(sock);
        m-=k;
        int count=0;
        int index=sock.length-1;
        while(m>0){
            if(index<0){
                System.out.println("-1");
                return;
            }
            m++;
            m-=sock[index];
            index--;
            count++;
        }
        System.out.println(count);
    }
}