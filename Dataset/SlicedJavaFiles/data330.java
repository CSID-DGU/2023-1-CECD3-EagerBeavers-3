public class Main{    public static void main(String[] args)throws Exception{
        int n = nextInt();
        char[] c = nextString().toCharArray();
        
        int tc = 0, hc = 0;
        for(int i = 0;i<c.length; i++){
            if(c[i] == 'T')tc++; else hc++;
        }
//      char g = 'T';
//      if(tc > hc){
//          tc = hc;
//          g = 'H';
//      }
        
        int max = -1;
        int pos = 0;
        for(int i = 0; i<c.length; i++){
            int a = 0;
            for(int j = 0; j<tc;j++){
                int k = i+j;
                if(k>=n)k-=n;
                if(c[k] == 'T'){
                    a++;
                }
            }
            if(a>max){
                max = a;
                pos = i;
            }
        }
        int min1 = tc - max;
        
        max = -1;
        pos = 0;
        for(int i = 0; i<c.length; i++){
            int a = 0;
            for(int j = 0; j<hc;j++){
                int k = i+j;
                if(k>=n)k-=n;
                if(c[k] == 'H'){
                    a++;
                }
            }
            if(a>max){
                max = a;
                pos = i;
            }
        }
        int min2 = hc - max;
        
        out.println(Math.min(min1, min2));
        out.flush();
    }
}