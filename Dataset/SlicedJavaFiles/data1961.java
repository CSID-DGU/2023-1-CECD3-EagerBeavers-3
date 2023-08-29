public class Main{    public static void main(String args[])throws Exception{
        br=new BufferedReader(new InputStreamReader(System.in));
        int nm[]=toIntArray();
        int n=nm[0];
        int k=nm[1];
        Pai p[]=new Pai[n];
        for(int i=0;i<n;i++){
            nm=toIntArray();
            p[i]=new Pai(nm[0],nm[1]);
        }
        Arrays.sort(p);
        int count=0;
        for(int i=0;i<n;i++){
            if(p[k-1].first==p[i].first && p[k-1].second==p[i].second){
                count++;
            }
        }
        System.out.println(count);

    }
}