public class Main{    public static void main (String[] args) throws java.lang.Exception {
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int T=1;
        for(int t=0;t<T;t++){
            int n=Int();
            int k=Int();
            int A[][]=new int[n][2];
            int a=0,b=0,c=0;
            for(int i=0;i<A.length;i++){
                A[i][0]=Int();
                A[i][1]=Int()-1;

                if(A[i][1]==0)a++;
                else if(A[i][1]==1)b++;
                else c++;
            }
            Solution sol=new Solution(out);
            sol.solution(A,k,a,b,c);
        }
        out.close();

    }
}