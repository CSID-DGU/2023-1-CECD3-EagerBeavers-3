public class Main{    public static void main (String[] args) throws java.lang.Exception {
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int T=1;
        for(int t=0;t<T;t++){
            int n=Int(),m=Int(),k=Int();
            List<int[]>g[]=new ArrayList[n*m+1];
            for(int i=0;i<g.length;i++){
                g[i]=new ArrayList<>();
            }
            for(int i=0;i<n;i++){
                for(int j=0;j<m-1;j++){
                    int w=Int();
                    int u=i*m+j;
                    int v=i*m+(j+1);
                    g[u].add(new int[]{v,w});
                    g[v].add(new int[]{u,w});
                }
            }

            for(int i=0;i<n-1;i++){
                for(int j=0;j<m;j++){
                    int w=Int();
                    int u=i*m+j;
                    int v=(i+1)*m+j;
                    g[u].add(new int[]{v,w});
                    g[v].add(new int[]{u,w});
                }
            }

            Solution sol=new Solution(out);
            sol.solution(n,m,k,g);
        }
        out.close();

    }
}