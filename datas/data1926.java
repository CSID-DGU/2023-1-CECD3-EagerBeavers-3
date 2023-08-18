public class Main{    public static void main(String args[])throws Exception{
        br=new BufferedReader(new InputStreamReader(System.in));
        int n = toInt();
        int nm[] = toIntArray();
        double a=0.0;
        double sum=0;
        for(int i=0;i<n;i++){
            sum+=nm[i];
        }
        a=sum/2;
        Arrays.sort(nm);
        int cur=0;
        int count=0;
        for(int i=nm.length-1;i>=0;i--){
            cur+=nm[i];
            count++;
            if(cur>a){
                break;
            }
        }
        System.out.println(count);


    }
}