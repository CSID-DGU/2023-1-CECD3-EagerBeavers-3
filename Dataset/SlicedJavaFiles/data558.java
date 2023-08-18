public class Main{    public static void main(String[] args) {
        StringBuilder ans = new StringBuilder();
        int t = ri();
//        int t=1;
        while (t-- > 0)
        {
            long n=rl();
            if(n%2==1)
            {
                ans.append("NO\n");
                continue;
            }

            if(n%4==0)
            {
                long val = n/4;

                long sq = (long) Math.sqrt(val);
                if(sq*sq == val)
                {
                    ans.append("YES\n");
                    continue;
                }
            }
            if(n%2==0)
            {
                long val = n/2;
                long sq = (long) Math.sqrt(val);
                if(sq*sq == val)
                {
                    ans.append("YES\n");
                    continue;
                }
            }
            ans.append("NO\n");

        }
        out.print(ans.toString());
        out.flush();

    }
}