public class Main{    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        //FileWriter f = new FileWriter("C:\\Users\\Ibrahim\\out.txt");
        PrintWriter pw = new PrintWriter(System.out);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int lo=0;
        int hi=n;
        int ans=0;
        while (lo<=hi){
            int mid=lo+hi>>1;
            long rem= n-mid;
            rem*=(rem+1);
            rem/=2;
            rem-=mid;
            //pw.println(rem+" "+mid+" "+k);
            if (rem==k){
                ans=mid;
                break;
            }
            else if (rem>k){
                lo=mid+1;
            }
            else hi=mid-1;
        }
        pw.println(ans);
        pw.flush();
    }
}