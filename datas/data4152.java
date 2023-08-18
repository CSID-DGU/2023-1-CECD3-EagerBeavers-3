public class Main{    public static void main(String g[])
    {

        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        m = new double[(1<<n) +1];
        vis = new boolean[(1<<n) +1];
        a = new double[n][n];

        for(int i=0;i<n;i++)
                {
            for(int j=0;j<n;j++)
            {
                //System.out.println("read"+(c++));
                a[i][j] = sc.nextDouble();
            }
                }

        s = new double[1<<n]; // 2^n
        int perm=0;
        m[0]=1;
        p();

//      System.out.println("answers : ");

        int c=((1<<n)-1);
        for(int i=0;i<n;i++)
        {
            perm = c-(1<<i);
//          System.out.printf("permutation = %x, prob = %f\n",perm,m[perm]);
            System.out.printf("%.6f ",m[perm]);
        }
//      getPerms(0);
//      p(perm);

//      double res[] = new double[n];
//      for(int i=0;i<n;i++)
        {
//          for(int j=0;j<n;j++)
//          if((i&(i-1))!=0)
//              continue;

//          res[i] =
//              p(perm,n);
//          System.out.println(m[i][j]);
        }

//      int cur=(1<<n)-1;
//
//int i=0;
//      for(i=0;i<n;i++)
//      {
//          int val=(cur-(1<<i));
//          int L = n-1;
//          System.out.printf("running for %x .... P = %f\n",val,getProb(val,L));
//
//      }

        //getP((1<<n)-1));

//      for(int i=0;i<m.length;i++)
//      {
//          System.out.println(m[perm]);
//      }


    }
}