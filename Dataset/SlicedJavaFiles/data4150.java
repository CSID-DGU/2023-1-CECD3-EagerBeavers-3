public class Main{    public static void main(String[] args){
  
        Scanner S=new Scanner(System.in);
        while(S.hasNext())
        {
            n=S.nextInt();
            int i,j;
            for(i=0;i<n;i++) for(j=0;j<n;j++) p[i][j]=S.nextDouble();
            DP();
            for(i=0;i<n;i++) 
            {
                if(i!=0) PR(" ");
                PR(f[1<<i]);
            }
            PR("\n");
        }
    }
}