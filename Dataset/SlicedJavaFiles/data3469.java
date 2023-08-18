public class Main{    public static void main(String[] args){
        in = new Parser(System.in);
        out = new PrintWriter(System.out);
        
//        
//        char[] ccc = new char[1];
//        String ddd = "abcdef";
//        ddd.getChars(2, 3, ccc, 0);
//        
//        String sssss = new String(ccc);
//      
//        System.out.println(sssss);
//        
        String s = in.nextString(100);
        int len = 0;
        String ss = "";
        
       
        l:for (int i = 1; i<=s.length(); i++){
            for(int j = 0; j+i<=s.length();j++){
                char[] c = new char[i];
                char[] cc = new char[i];
                s.getChars(j, j+i, c, 0);
                String sss = new String(c);
                //System.out.println(sss);
                for(int k = j+1; k+i<=s.length();k++){
                     
                    s.getChars(k, k+i, cc, 0);
                    String ssss = new String(cc);
                    if(sss.equals(ssss)) {len = i; continue l;}
                }
            }
        }
        
        
        System.out.println(len);
       // out.flush();
    }
}