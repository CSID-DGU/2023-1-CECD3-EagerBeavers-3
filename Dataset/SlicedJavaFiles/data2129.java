public class Main{    public static void main(String[] args) throws Exception {
        int n=nextInt();
        int r=nextInt();
        int x[]=new int[n];
        double y[]=new double[n];
        for(int i=0;i<n;i++)
            x[i]=nextInt();
        for(int i=0;i<n;i++){
            //(x1-x2)2+(y1-y2)2=r2
            y[i]=r;
            for(int j=0;j<i;j++){
                int d=sq(2*r)-sq(x[i]-x[j]);
                if(d>=0){
                    double y1=Math.sqrt(d)+y[j];
                    y[i]=Math.max(y1,y[i]);
                }
            }
        }
        for(int i=0;i<n;i++)
            System.out.printf("%.12g ",y[i]);
    }
}