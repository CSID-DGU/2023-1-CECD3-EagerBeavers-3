public class Main{    public static void main (String[] args) throws java.lang.Exception {
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int T=1;
        for(int t=0;t<T;t++){
            int n=Int(),k=Int();
            int A[][]=new int[n][2];
            for(int i=0;i<n;i++){
                A[i][0]=Int();
                A[i][1]=Int();
            }

            Solution sol=new Solution(out);
            sol.solution(A,k);
        }
        out.close();

    }
}