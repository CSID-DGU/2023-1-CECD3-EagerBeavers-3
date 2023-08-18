public class Main{    public static void main (String[] args) throws java.lang.Exception {
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int T=1;
        for(int t=0;t<T;t++){
            int n=Int(),m=Int();

            Solution sol=new Solution(out);
            sol.solution(n,m);
        }
        out.close();

    }
}