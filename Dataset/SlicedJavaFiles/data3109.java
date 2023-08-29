public class Main{    public static void main(String[] args) {
        // TODO code application logic here
        try
        {
            Parserdoubt pd=new Parserdoubt(System.in);
            //BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            int n=pd.nextInt();
            PrintWriter pw=new PrintWriter(System.out);
            pw.println((n*3)/2);
            pw.flush();
        }
        catch(Exception e)
        {}

    }
}