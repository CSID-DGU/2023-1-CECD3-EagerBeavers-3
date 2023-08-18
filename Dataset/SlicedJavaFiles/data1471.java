public class Main{public static void main(String[] args) throws IOException
{
    
    //Scanner input = new Scanner(new File("input.txt"));
    //PrintWriter out = new PrintWriter(new File("output.txt"));
    PrintWriter out = new PrintWriter(System.out);
    input.init(System.in);
    long a = input.nextLong(), b = input.nextLong();
    if(a==b)
    {
        out.println(0);
        out.close();
        return;
    }
    long res = 0;
    for(int i = 0; i<63; i++)
    {
        if(a%(1l<<i) >= b%(1l<<i))
            res += (1l<<i);
        else if(b/((1l<<i)) > a/((1l<<i)))
            res += (1l<<i);
    }
    out.println(res);
    out.close();
}
}