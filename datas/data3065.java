public class Main{    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n=in.nextInt();
    
        out.print(n/2+n);
       
        out.close();
        in.close();
    }
}