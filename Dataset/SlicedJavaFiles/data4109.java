public class Main{    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         x=sc.nextInt();y=sc.nextInt();
         a=new Point[sc.nextInt()];
        for(int i=0;i<a.length;i++) {
            a[i]=new Point(sc.nextInt(), sc.nextInt());
        }
        end=(1<<a.length)-1;
        dp=new int[1<<a.length];
        Arrays.fill(dp, -1);
        dist=new int[a.length][a.length];
        dist1=new int[a.length];
        for(int i=0;i<a.length;i++) {
            dist1[i]=(a[i].x-x)*(a[i].x-x)+(a[i].y-y)*(a[i].y-y);
            for(int j=i+1;j<a.length;j++) {
                
                dist[i][j]=dist1[i]+
                (a[j].x-a[i].x)*(a[j].x-a[i].x)+(a[j].y-a[i].y)*(a[j].y-a[i].y)+
                (a[j].x-x)*(a[j].x-x)+(a[j].y-y)*(a[j].y-y);
                //System.out.println(dist[i][j]);
            }
        }
        path=new int[dp.length];
        System.out.println(doit(0));
        int e=0;
        int cur=path[e];
        StringBuffer bf=new StringBuffer();
        bf.append(0+" ");
        int count=0;
        for(int i=0;count<a.length;i++) {
            //System.out.println(Integer.toBinaryString(cur)+" "+cur);
            for(int j=0;j<a.length;j++) {
                if(((1<<j)|cur)==cur) {
                    bf.append((j+1)+" "); count++;
                }
            }
            e|=cur;
            cur=path[e];
            bf.append(0+" ");
        }
        System.out.println(bf);
    }
}