public class Main{    public static void main(String[] args) throws IOException
    {
        new Thread(null, new E(), "", 1 << 20).start();
    }   
}