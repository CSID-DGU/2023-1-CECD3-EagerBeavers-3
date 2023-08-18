public class Main{    public static void main(String[] args) throws IOException
    {
        new Thread(null, new B(), "", 1 << 20).start();
    }
}