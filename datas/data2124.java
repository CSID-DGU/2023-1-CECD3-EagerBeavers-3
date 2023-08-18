public class Main{    public static void main(String[] args) {
        FastScanner sc=new FastScanner();
        PrintWriter pw=new PrintWriter(System.out);
        double eps=1e-12;
        while(sc.hasNext()){
            int n=sc.nextInt();
            int r=sc.nextInt();
            double[]shu=new double[n];
            for(int i=0;i<n;i++)shu[i]=sc.nextDouble();
            double[]res=new double[n];
            for(int i=0;i<n;i++){
                for(int j=0;j<i;j++){
                    double temp=Math.abs(shu[i]-shu[j]);
                    if(temp<2*r||Math.abs(temp-2*r)<eps){
                        res[i]=Math.max(res[i],res[j]+Math.sqrt(4*r*r-temp*temp));
                    }
                }
                res[i]=Math.max(res[i],r);
            }
            for(int i=0;i<n;i++){
                pw.print(res[i]+" ");
            }
            pw.flush();
        }
    }
}