public class Main{    public static void main (String[] args) throws java.lang.Exception {
        PrintWriter out = new PrintWriter(System.out);


        int T=1;
        for(int t=0;t<T;t++){
            long k=Long();
            Solution sol=new Solution(out);
            sol.solution(k);
        }
        out.flush();

    }
}