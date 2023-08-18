public class Main{    public static void main(String[] args) throws Exception {
        in = new FastScanner(System.in);
        n = in.nextInt();
        int a = query(1);
        if(((a % 2)+2) % 2== 1){
            System.out.println("! -1");
            return;
        }
        if(a == 0){
            System.out.println("! 1");
            return;
        }
        bins(1 , n/2 + 1 , a , -a);
    }
}