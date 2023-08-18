public class Main{    public static void main(String[] args) throws Exception{
        BufferedReader bff=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wff=new PrintWriter(System.out);
        String[] st=bff.readLine().split(" ");
        int V=Integer.parseInt(st[0]);
        int K=Integer.parseInt(st[1]);
        BronKerbosch bk=new BronKerbosch(V);
        for(int i=0;i<V;i++){
            st=bff.readLine().split(" ");
            for(int j=0;j<V;j++){
                if(st[j].equals("1")){
                    bk.anadir(i,j);
                }
            }
        }
        long num=bk.numeroCamarilla();
        wff.printf("%.12f\n", num * (num - 1.0) / 2 * K / num * K / num);
        wff.flush();
    }
}