public class Main{    public static void main(String[] args) throws IOException {
  //    Scanner s=new Scanner(System.in);
     Reader s=new Reader();
    int n=s.nextInt();
        
        int a[]=new int[n];
        
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        
        Map<Long,PriorityQueue<Node>> map=new HashMap();
        
        for(int i=0;i<n;i++){
            long sum=0;
            for(int j=i;j<n;j++){
                sum=sum+a[j];
                PriorityQueue<Node> pq=map.get(sum);
                if(pq==null){
                    pq=new PriorityQueue();
                    map.put(sum, pq);
                }
                pq.add(new Node(i,j));
            }
            
            
        }
        
        
        Set<Long> keys=map.keySet();
        
        Iterator<Long> itr=keys.iterator();
        int max=0;
        int solbackDp[]=null;
        Node solA[]=new Node[0];
        while(itr.hasNext()){
           Long sum=itr.next();
           PriorityQueue<Node> pq1=map.get(sum);
           
           
           
           
           
           
           //Node rangelist[]=new  Node[pq1.size()+1];
            ArrayList<Node> rangelist=new ArrayList<>();
            rangelist.add(new Node(-1, -1));
            //int count=1;
            //rangelist[0]=new Node(-1,-1);
             Node last=rangelist.get(0);
            while(!pq1.isEmpty()){
                Node n1=pq1.poll();
                if(n1.l!=last.l){
                    rangelist.add(n1);
                    last=n1;
                } 
                       
           }
           int backTrack[]=new int[rangelist.size()];
           int dp[]=new int[rangelist.size()];
           Arrays.fill(dp, -1);
           int ans=fun(0,dp,rangelist,backTrack);
           if(ans>max){
               max=ans;
               solA=rangelist.toArray(solA);
               solbackDp=backTrack;
           }
        }
        
        System.out.println(max);
        
        
        int pos=0;
        while(solbackDp[pos]!=-1){
            pos=solbackDp[pos];
            System.out.println((solA[pos].l+1)+" "+(solA[pos].r+1));
        }
    }
}