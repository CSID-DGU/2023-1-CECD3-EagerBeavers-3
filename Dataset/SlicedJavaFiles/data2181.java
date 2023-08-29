public class Main{    public static void main(String[] args) {

        MyScanner in = new MyScanner();
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        int r = in.nextInt();

        double[] y = new double[n];
        int[] x = new int[n];

        for(int i=0;i<n;++i){
            x[i] = in.nextInt();
            double bestY = r;
            for(int j=0;j<i;++j){
                if(Math.abs(x[i]-x[j]) <= 2*r){
                    double ny = y[j] + Math.sqrt(4*r*r - (x[i]-x[j])*(x[i]-x[j]));
                    if(ny > bestY){
                        bestY = ny;
                    }
                }
            }
            y[i] = bestY;
        }

        for(int i=0;i<n;++i){
            out.println(y[i]);
        }

        out.close();

    }
}