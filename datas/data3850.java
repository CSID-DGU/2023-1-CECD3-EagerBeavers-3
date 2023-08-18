public class Main{    public static void main(String[] args) throws Exception{
        if(memory)new Thread(null, new Runnable() {public void run(){try{new CF_1523_C().run();}catch(Exception e){e.printStackTrace();System.exit(1);}}}, "1", 1 << 28).start();
        else new CF_1523_C().run();
    }
}