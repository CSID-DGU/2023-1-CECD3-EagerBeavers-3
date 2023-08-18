public class Main{    public static void main(String[] args) throws IOException
    {
        Reader in = new Reader();
//        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = in.nextInt();
        boolean[] A = new boolean[n];
        int count = 0;
        int[] B = new int[n];
        for (int i=0;i<n;i++)
            B[i] = in.nextInt();
        Arrays.sort(B);
        for (int i=0;i<n;i++)
        {
            if (!A[i])
            {
                int gcd = B[i];
                for (int j=0;j<n;j++)
                {
                    if(!A[j])
                    {
                        gcd = gcd(B[j], gcd);
                        if(gcd == B[i])
                        {
                            A[j] = true;
                        }
                        else
                        {
                            gcd = B[i];
                        }
                    }
                }
                count++;
                A[i] = true;
            }
        }
        System.out.println(count);
    }
}