public class Main{    public static void main (String[] args) throws java.lang.Exception
    {
        Reader sn = new Reader();
        Print p = new Print();
        int n = sn.nextInt();
        while((n--) > 0){
             int a = sn.nextInt();
             int b = sn.nextInt();
             int small = Math.min(a , b);
             int large = Math.max(a , b);
             long steps = 0;
             while(small != 0){
                  steps += (long)(large/small);
                  int large1 = small;
                  small = large % small;
                  large = large1;
             }
             p.printLine(Long.toString(steps));
        }
        p.close();
    }
}