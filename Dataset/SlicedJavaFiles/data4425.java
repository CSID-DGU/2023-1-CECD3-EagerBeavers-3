public class Main{    public static void main (String[] args) throws java.lang.Exception {
        PrintWriter out = new PrintWriter(System.out);


        int T=1;
        for(int t=0;t<T;t++){
            int n=Int();int m=Int();
            int A[][]=new int[n][m];

            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    A[i][j]=Int();
                }
            }

            Sol sol=new Sol();
            sol.solution(out,A);
        }
        out.flush();

    }
}