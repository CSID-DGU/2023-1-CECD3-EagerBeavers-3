public class Main{    public static void main(String[] args) throws IOException {
        if (ONLINE_JUDGE){
            in = new BufferedReader(new InputStreamReader(System.in));
            out = new PrintWriter(System.out);
        }else{
            in = new BufferedReader(new FileReader("input.txt"));
            out = new PrintWriter("output.txt");
        }
        new CodeForces().runIt();
        out.flush();
        out.close();
        return;
    }
}