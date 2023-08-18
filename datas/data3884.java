public class Main{    public static void main(String args[]) throws IOException {
        Scan input=new Scan();
        StringBuilder ans=new StringBuilder("");
        int test=input.scanInt();
        for(int tt=1;tt<=test;tt++) {
            int n=input.scanInt();
            
            ArrayList<Integer> arrli[]=new ArrayList[n];
            for(int i=0;i<n;i++) {
                arrli[i]=new ArrayList<>();
            }
            
            for(int i=0;i<n;i++) {
                int tmp=input.scanInt();
                if(i==0) {
                    arrli[0].add(1);
                    continue;
                }
                if(tmp==1) {
                    for(int j=0;j<arrli[i-1].size();j++) {
                        arrli[i].add(arrli[i-1].get(j));
                    }
                    arrli[i].add(tmp);
                    continue;
                }
                int indx=-1;
                for(int j=0;j<arrli[i-1].size();j++) {
                    if(arrli[i-1].get(j)==tmp-1) {
                        indx=j;
                    }
                }
                for(int j=0;j<indx;j++) {
                    arrli[i].add(arrli[i-1].get(j));
                }
                arrli[i].add(tmp);
            }
            for(int i=0;i<n;i++) {
               for(int j=0;j<arrli[i].size();j++) {
                   ans.append(arrli[i].get(j));
                   if(j!=arrli[i].size()-1) {
                       ans.append(".");
                   }
               }
               ans.append("\n");
            }
        }
        System.out.println(ans);
    }
}