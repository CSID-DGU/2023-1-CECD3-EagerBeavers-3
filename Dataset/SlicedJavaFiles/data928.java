public class Main{    public static void main(String args[])throws Exception
    {
        new Thread(null,new templ(),"templ",1<<27).start();
    }
}