public class Main{    public static void main(String[] args) 
    {	
        InputStream inputstream = System.in;
        OutputStream outputstream = System.out;
        InputReader in = new InputReader(inputstream);
        OutputWriter out = new OutputWriter(outputstream);
        mysolver mysol = new mysolver();
        mysol.solve(in, out);
        out.close();
    }
}