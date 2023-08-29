public class Main{    public static void main(String[] args) {
        in = new Parser(System.in);
        out = new PrintWriter(System.out);
        
        int n= in.nextInt();
        int min = 101;
        boolean b = false;
        int pmin = 101;
        int t= 0 ;
        for(int i=0; i<n; i++){
            t = in.nextInt();
            
            if (t<min){if(min != pmin)b=true; if(b) pmin = min;  min = t;  continue;}
            if (t>min && t<pmin){b=true; pmin = t;  continue;}
            if (t>min && !b){b=true; pmin = t;  continue;}
            //if (b){if(t<pmin){pmin = t; continue;}}
            //out.print(min);
            //out.print(pmin);
        }
        if (b) System.out.println(pmin); else System.out.println("NO");
        //out.flush();
    }
}