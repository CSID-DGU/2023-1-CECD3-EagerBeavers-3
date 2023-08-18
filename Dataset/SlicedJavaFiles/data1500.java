public class Main{    public static void main (String [] args) throws Exception {
        
        // Use BufferedReader rather than RandomAccessFile; it's much faster
        f = new BufferedReader(new java.io.InputStreamReader(System.in));
        
        long unixTime = System.currentTimeMillis();
        
        long l=nextLong();
        long r=nextLong();
        
        String ll=Long.toBinaryString(l);
        String rr=Long.toBinaryString(r);
        
        System.err.println(ll);
        System.err.println(rr);
        
        System.err.println(Long.parseLong(rr,2));
        
        int len=0;
        if(ll.length()!=rr.length()){
            len=Math.max(ll.length(),rr.length());
        }else{
            //same
            for(int i=0;i<ll.length();i++){
                if(ll.charAt(i)!=rr.charAt(i)){
                    len=ll.length()-i;
                    break;
                }
            }
        }
        System.err.println(len);
        //long out=0;
        StringBuffer s=new StringBuffer();
        for(int i=0;i<len;i++){
            //out+=Math.pow(2, i);
            s.append(1);
        }
        
        if(len==0){
            System.out.println(0);
        }else{
            System.out.println(Long.parseLong(s.toString(),2));
        }
        
//      System.out.println("Time elapsed (ms): "+(System.currentTimeMillis()-unixTime));
        
        System.exit(0);                               // don't omit this!
      }
}