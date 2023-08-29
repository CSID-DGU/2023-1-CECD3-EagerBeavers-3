public class Main{    public static void main(String[] args) throws Exception{
        IO io = new IO(null,null);
        n = io.getNextInt();
        S = new char[n];
        for (int i = 0;i < n;i++) S[i] = io.getNext().charAt(0);
        io.println(solve(0,0));
        io.close();
    }
}