public class Main{    public static void main(String[] args) throws IOException 
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer("");
        String temp[] = br.readLine().split(" ");
        long pos = Long.parseLong(temp[0]);
        out = new PrintWriter(new BufferedOutputStream(System.out));
        if (pos<10)
        {
            out.println(pos);
        }
        else
        {
            out.println(findDigitSequence(pos));
        }
        out.close();
    }
}