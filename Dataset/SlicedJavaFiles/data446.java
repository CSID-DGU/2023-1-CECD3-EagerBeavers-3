public class Main{    public static void main(String args[]) throws Exception {
        new Thread(null, new TaskA(),"TaskA",1<<26).start();
    }
}