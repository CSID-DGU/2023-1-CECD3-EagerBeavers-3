public class Main{    public static void main(String[] args) {
        new Thread(null,null,"BaZ",99999999)
        {
            public void run()
            {
                try
                {
                    solve();
                }
                catch(Exception e)
                {  
                    e.printStackTrace();
                    System.exit(1);
                }
            }
        }.start();
    }
}