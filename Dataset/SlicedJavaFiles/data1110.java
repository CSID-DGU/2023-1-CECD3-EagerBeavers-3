public class Main{    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = sc.nextInt();
        int half = n/2;
        pw.println("? 1");
        pw.flush();
        int a = sc.nextInt();
        pw.println("? " + (1+half));
        pw.flush();
        int b = sc.nextInt();
        if(a - b == 0){
            pw.println("! 1");
        }
        else
        if((a - b)%2 != 0)
        {
            pw.println("! -1");
        }else{
            boolean greater = a > b;
            int lo = 1;
            int hi = half;

            boolean ans = false;
            while(lo <= hi){
                int mid = (lo + hi) /2;
                pw.println("? " + mid);
                pw.flush();
                a = sc.nextInt();
                pw.println("? " + (mid+half));
                pw.flush();
                b = sc.nextInt();

                if(a == b){
                    pw.println("! " + mid);
                    ans = true;
                    break;
                }

                if(a > b != greater){
                    hi = mid-1;
                }else{
                    lo = mid+1;
                    greater = a>b;
                }
            }

            if(!ans){
                pw.println("! -1");
            }

        }

        pw.flush();
        pw.close();
    }
}