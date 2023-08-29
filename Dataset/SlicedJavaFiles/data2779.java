public class Main{    public static void main(String[] args) throws IOException{
        FastScanner s = new FastScanner();
        PrintWriter ww = new PrintWriter(new OutputStreamWriter(System.out));
        int test = s.nextInt(); int cnt=0;
        while(test-->0){
            int a = s.nextInt();
            int b = s.nextInt();
            cnt=0;
            while(a!=0 && b!=0){
                int max = Math.max(a, b);
                if(max == b){
                    int divi = b/a;
                    b -= divi*a;
                    cnt+=divi;
                }else{
                    int divi = a/b;
                    a -= divi*b;
                    cnt+=divi;
                }
        //      System.out.println(a+" "+b);
            }
            ww.println(cnt);
        }
        ww.close();
    }
}