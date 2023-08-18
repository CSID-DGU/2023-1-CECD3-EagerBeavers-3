public class Main{    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(new File("input.txt"));
//        Scanner sc=new Scanner(System.in);
        PrintWriter pw=new PrintWriter("output.txt");
        int n=sc.nextInt(),m=sc.nextInt(),k=sc.nextInt();
        Queue<Integer> pq=new ArrayDeque<>();
        boolean[] vis=new boolean[n*m];
        for(int i=0;i<k;i++){
            int r=sc.nextInt()-1,c=sc.nextInt()-1;
            pq.add(m*r+c);
            vis[m*r+c]=true;
        }
        sc.close();
        int ans=0;
        while(pq.size()!=0){
            int x=pq.remove();

            ans=x;
            if(n!=1 && x%n==0){
                if(x+m<n*m&&!vis[x+m]){
                    pq.add(x+m);
                    vis[x+m]=true;
                }
                if(x-m>=0&&!vis[x-m]){
                    pq.add(x-m);
                    vis[x-m]=true;
                }
                if(x+1<n*m&&!vis[x+1]){
                    pq.add(x+1);
                    vis[x+1]=true;
                }
            }
            else if(n!=1 && (x+1)%n==0){
                if(x+m<n*m&&!vis[x+m]){
                    pq.add(x+m);
                    vis[x+m]=true;
                }
                if(x-m>=0&&!vis[x-m]){
                    pq.add(x-m);
                    vis[x-m]=true;
                }
                if(x-1>=0&&!vis[x-1]){
                    pq.add(x-1);
                    vis[x-1]=true;
                }
            }
            else{
                if(x+m<n*m&&!vis[x+m]){
                    pq.add(x+m);
                    vis[x+m]=true;
                }
                if(x-m>=0&&!vis[x-m]){
                    pq.add(x-m);
                    vis[x-m]=true;
                }
                if(x-1>=0&&!vis[x-1]){
                    pq.add(x-1);
                    vis[x-1]=true;
                }
                if(x+1<n*m&&!vis[x+1]){
                    pq.add(x+1);
                    vis[x+1]=true;
                }
            }
        }
        pw.println((ans/m+1)+" "+(ans%m+1));
        pw.close();
    }
}