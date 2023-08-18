public class Main{    public static void main(String args[]) throws Exception {
        new Thread(null, new TaskB(),"TaskB",1<<26).start();
    }
}