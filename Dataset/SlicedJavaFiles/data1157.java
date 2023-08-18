public class Main{    public static void main(String[] args)  {
        new Thread(null, new main(), "Check2", 1<<26).start();// to increse stack size in java
    }
}