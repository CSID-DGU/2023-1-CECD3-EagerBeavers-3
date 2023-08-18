public class Main{    public static void main(String[] args) throws Exception {
        try (FastReader in = new FastReader();
             FastWriter out = new FastWriter()) {
            int t, i, j, n, k, l, r, m, c, p, q, ti, tidx;
            long x, y, z;

            //for (t = in.nextInt(), tidx = 1; tidx <= t; tidx++)
            {
                //out.print(String.format("Case #%d: ", tidx));
                n=in.nextInt();
                int a[]=new int[101];
                for (i=0;i<n;i++){
                    a[in.nextInt()]++;
                }
                m=0;
                for(i=1;i<101;i++){
                    if(a[i]>0){
                        m++;
                        for(j=i;j<=100;j+=i){
                            a[j]=0;
                        }
                    }
                }
                out.println(m);
            }
            out.commit();
        }
    }
}