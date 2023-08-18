public class Main{    public static void main(String[] args) 
    {
        InputReader sc=new InputReader(System.in);
        int n=sc.nextInt();
        int s=sc.nextInt();
        card c[]=new card[n];
        for(int i=0;i<n;i++)
        {
            int x=sc.nextInt();
            int y=sc.nextInt();
            c[i]=new card(x,y);
        }
        Arrays.sort(c,new sort());
        int time=0;
        for(int i=n-1;i>=0;i--)
        {
            time+=s-c[i].l;
            if((c[i].r-time)>0)
            time+=c[i].r-time;
            s=c[i].l;
        }
        if(c[0].l!=0)
        time+=c[0].l;
        System.out.println(time);
    }
}