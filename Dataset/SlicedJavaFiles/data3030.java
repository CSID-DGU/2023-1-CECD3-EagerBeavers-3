public class Main{    public static void main(String[] args) throws Exception {        
        //Scanner reader = new Scanner(new File("input.txt"));
        //PrintWriter writer = new PrintWriter("output.txt");
        Scanner reader = new Scanner(System.in);
        writer = new PrintWriter(System.out);
        
        n = reader.nextInt();
        maxstep = String.valueOf(n).length() + 1;
        
        g(0, 0);
        
        writer.print("NO");
        writer.close();
    }
}