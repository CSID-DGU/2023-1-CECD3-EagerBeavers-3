public class Main{    public static void main(String[] args) throws IOException {
        Reader r = new Reader();
        //PrintWriter writer=new PrintWriter(System.out);
        //Scanner r = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        //Scanner r=new Scanner(System.in);
        OutputWriter770 out77 = new OutputWriter770(System.out);

        int num1=r.nextInt();
        int[] arr1=r.nextArray(num1);
        Arrays.sort(arr1);

        int res1=0;
        for(int i=0;i<num1;i++)
        {
            if(arr1[i]!=-1)
            {
                res1++;
                int num2=arr1[i];
                arr1[i]=-1;
                for(int j=i+1;j<num1;j++)
                {
                    if(arr1[j]%num2==0)
                    {
                        arr1[j]=-1;
                    }
                }
            }
        }
        out77.print(res1+"");
        r.close();
        out77.close();
    }
}