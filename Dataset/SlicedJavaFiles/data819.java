public class Main{    public static void main(String[] args) {
        try{
            Locale.setDefault(Locale.US);
        } catch (Exception e)
        {
            
        }
        new Thread(new Main()).start();
        //new Thread(null, new Main(), "1", 1<<25).start();
    }
}