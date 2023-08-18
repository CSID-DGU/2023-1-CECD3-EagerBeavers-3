public class Main{    public static void main(String[] args) {
        in = new FastReader();
        int n=ni();
        int[] arr=takeIntegerArrayInput(n);
        HashMap<Long,ArrayList<pair>> hm=new HashMap<>();
        int max_size=0;
        long S=-1;
        for (int i=0;i<arr.length;i++){
            long sum=0;
            for (int j=i;j>=0;j--){
                sum+=arr[j];
                if (!hm.containsKey(sum)){
                    hm.put(sum,new ArrayList<>());
                }
                if (hm.get(sum).size()==0||hm.get(sum).get(hm.get(sum).size()-1).y<j){
                    hm.get(sum).add(new pair(j,i));
                }
                if (hm.get(sum).size()>max_size){
                    max_size=hm.get(sum).size();
                    S=sum;
                }

            }
        }
        System.out.println(max_size);
        StringBuilder sb=new StringBuilder();
        for (int i=0;i<hm.get(S).size();i++){
            sb.append(hm.get(S).get(i)).append("\n");
        }
        System.out.print(sb.toString());


    }
}