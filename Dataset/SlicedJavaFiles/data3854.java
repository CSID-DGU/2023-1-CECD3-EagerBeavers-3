public class Main{    public static void main(String[]args)throws IOException
    {
        boolean oj = System.getProperty("ONLINE_JUDGE") != null;
        if(oj){sc=new AnotherReader();out=new PrintWriter(System.out);}
        else{sc=new AnotherReader(100);out=new PrintWriter("output.txt");}
        int t=1;
        t=ni();
        while(t-- > 0) {process();}
        out.flush();out.close();  
    }
}