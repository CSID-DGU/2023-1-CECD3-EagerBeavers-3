public class Main{    public static void main(String[] args) {
    	try{
            new Thread(null, new c1523(), "process", 1<<26).start();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}