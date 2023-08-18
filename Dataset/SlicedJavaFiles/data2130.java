public class Main{  public static void main(String[] args){
    InputReader reader = new InputReader(System.in);
    PrintWriter pw = new PrintWriter(System.out);
    int n = reader.nextInt();
    int r = reader.nextInt();
    int[] x = new int[n];
    double[] y = new double[n];
    
    for(int i=0;i<n;++i){
      int iniX = reader.nextInt();
      double bestY = (double)r;
      for(int j=0;j<i;++j){
//         pw.printf("testing %d %d\n", i, j);
        if(Math.abs(iniX - x[j]) < 2*r){
//           pw.printf("on colision %d %d\n", i, j);
          bestY = Math.max(bestY, collisionY((double)x[j], y[j], (double)iniX, r));
        }
        if(Math.abs(iniX - x[j]) == 2*r){
//           pw.printf("touvhing %d %d\n", i, j);
          bestY = Math.max(bestY, y[j]);
        }
      }
      x[i] = iniX;
      y[i] = bestY;
    }
    for(int i=0;i<n;++i){
      pw.printf("%.9f ", y[i]);
    }   
    pw.flush();
    pw.close();
  }
}