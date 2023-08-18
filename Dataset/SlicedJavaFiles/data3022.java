public class Main{    public static void main(String[] args)throws IOException
    {
        BufferedReader scan=new BufferedReader(new InputStreamReader(System.in));
        short num=Short.parseShort(scan.readLine());
        if(funcion(num))
        {
            System.out.println("YES");
        }
        else
            System.out.println("NO");
    }
}