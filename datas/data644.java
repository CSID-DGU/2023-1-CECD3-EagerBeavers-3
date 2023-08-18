public class Main{    public static void main(String[] args) {
        // TODO code application logic here
        try
        {
            Parserdoubt pd=new Parserdoubt(System.in);
            int t=pd.nextInt();
            int inde=0,indo=0,o=0,e=0;
            for(int i=0;i<t;i++)
            {
                if(pd.nextInt()%2==0)
                {
                    inde=i;
                    e++;
                }
                else
                {
                    o++;
                    indo=i;
                }
            }
            if(o==1)
            {
                System.out.println(indo+1);
            }
            else
            {
                System.out.println(inde+1);
            }
        }
        catch(Exception e){}
    }
}