public class Main{    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int n=sc.nextInt();
        int[]a=new int[n];
        
        int su=0;
        for(int i=0;i<n;i++)
        {
            a[i]=-sc.nextInt();
            su+=-1*a[i];
        }
        Arrays.sort(a);
        
        
        int ss=0;
        for(int i=0;i<n;i++)
        {
            ss+=-1*a[i];
            su-=-1*a[i];
            if(ss > su)
            {
                System.out.println(i+1);
                return;
            }
        }
        
    }
}