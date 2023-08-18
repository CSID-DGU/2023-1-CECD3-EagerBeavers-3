public class Main{    public static void main(String[] args) throws IOException {

        Scan scan = new Scan();
        int n = scan.scanInt();
        long d = scan.scanLong();
        long a[]=new long[n];
        for(int i=0;i<n;i++){
            a[i]=scan.scanLong();
        }
        Arrays.sort(a);
        int count=0;
        for(int i=0;i<n-1;i++){
            if((a[i+1]-d)>(a[i]+d)){
                count+=2;
            }else if((a[i+1]-d)==(a[i]+d)){
                count++;
            }
        }
        count+=2;
        System.out.println(count);
    }
}