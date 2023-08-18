public class Main{    public static void main(String[] args){
        new Thread(null, new C(), "", MAX_STACK_SIZE * (1L << 20)).start();
    }
}