public class Main{    public static void main(String[] args) throws IOException
    {
        new Thread(null, new A(), "", 1 << 22).start();
    }
}