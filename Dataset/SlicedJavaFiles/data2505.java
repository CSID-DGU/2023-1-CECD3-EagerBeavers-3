public class Main{    public static void main (String[] args) throws java.lang.Exception {
        PrintWriter out = new PrintWriter(System.out);



        int T=1;
        for(int t=0;t<T;t++){
            int n=Int();
            int A[]=new int[n];
            for(int i=0;i<n;i++){
                A[i]=Int();
            }

            Solution sol=new Solution();
            sol.solution(out,A);
        }
        out.flush();

    }
}