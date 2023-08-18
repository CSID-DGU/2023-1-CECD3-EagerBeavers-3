public class Main{    public static void main(String args[]) throws IOException {
        Scan input=new Scan();
        StringBuilder ans=new StringBuilder("");
        int test=input.scanInt();
//        boolean sq[]=new boolean[1000000005];
//        for(int i=1;i*i<sq.length;i++) {
//            sq[i*i]=true;
//        }
        for(int tt=1;tt<=test;tt++) {
            int n=input.scanInt();
            if(n%2==1) {
                ans.append("NO\n");
                continue;
            }
            n/=2;
            double sq=Math.sqrt(n);
            if(Math.floor(sq)==Math.ceil(sq)) {
                ans.append("YES\n");
                continue;
            }
            if(n%2==1) {
                ans.append("NO\n");
                continue;
            }
            n/=2;
            sq=Math.sqrt(n);
            if(Math.floor(sq)==Math.ceil(sq)) {
                ans.append("YES\n");
                continue;
            }
            ans.append("NO\n");
        }
        System.out.println(ans);
    }
}