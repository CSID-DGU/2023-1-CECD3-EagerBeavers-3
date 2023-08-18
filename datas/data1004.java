public class Main{    public static void main(String[] args) {      //threading has been used to increase the stack size.

        new Thread(null, null, "Vengeance", 1 << 25)  //the last parameter is stack size desired.
        {
            public void run() {
                try {
                    double s = System.currentTimeMillis();
                    MainSolution();
                    //pl(("\nExecution Time : " + ((double) System.currentTimeMillis() - s) / 1000) + " s");
                    pw.flush();
                    pw.close();
                } catch (Exception e) {
                    e.printStackTrace();
                    System.exit(1);
                }
            }
        }.start();
    }
}