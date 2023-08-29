public class Main{    public static void main(String[] args)
    {
        try
        {
            Parserdoubt pd=new Parserdoubt(System.in);
            PrintWriter pw=new PrintWriter(System.out);
            senators=pd.nextInt();
            int candies=pd.nextInt();
            senator_attr=new int[senators][2];
            A=pd.nextInt();
            for(int i=0;i<senators;i++)
            {
                senator_attr[i][0]=pd.nextInt();
                senator_attr[i][1]=pd.nextInt();
            }
            max=-1;
            make(0,candies,new int[senators]);
            //print(maxer);
            System.out.printf("%.10f",max);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}