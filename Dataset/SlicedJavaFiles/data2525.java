public class Main{    public static void main (String[] args) throws Exception {
        String st[]=br.readLine().split(" ");
        int n=Integer.parseInt(st[0]);
        long input[]=new long[n];
        st=br.readLine().split(" ");
        for(int i=0;i<n;i++){
            input[i]=Long.parseLong(st[i]);
        }
        HashMap<Long,ArrayList<Pair>> map=new HashMap<>();
        long pref[]=new long[n+1];
        pref[1]=input[0];
        for(int i=1;i<n;i++){
            pref[i+1]=pref[i]+input[i];
        }
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                long sum=pref[j+1]-pref[i];
                if(!map.containsKey(sum)){
                    ArrayList<Pair> list=new ArrayList<>();
                    list.add(new Pair(i,j));
                    map.put(sum,list);
                }
                else{
                    ArrayList<Pair> list=map.get(sum);
                    list.add(new Pair(i,j));
                }
            }
        }
        ArrayList<Pair> ans=new ArrayList<>();
       // debug(map);
        for(long keys:map.keySet()){
            ArrayList<Pair> list=map.get(keys);
            Collections.sort(list,new PairComp());
            int nn=list.size();
            for(int j=0;j<=0;j++){
                ArrayList<Pair> cur=new ArrayList<>();
                cur.add(list.get(j));
                int lim=list.get(j).v;
                int i=j;
                while(i<nn){
                    if(list.get(i).u<=lim){
                        i++;
                    }
                    else{
                        cur.add(list.get(i));
                        lim=list.get(i).v;
                        i++;
                    }
                }
                if(ans.size()<cur.size()){
                    ans=cur;
                }
            }
        }
        out.println(ans.size());
        for(Pair p:ans){
            out.println(++p.u+" "+ ++p.v);
        }
/****************************************Solutions Ends**************************************************/
        out.flush();
        out.close();
    }
}