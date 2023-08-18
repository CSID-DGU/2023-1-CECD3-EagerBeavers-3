public class Main{    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        int[] arr = new int[n];
        for(int i = 0; i<n; i++) arr[i] = Integer.parseInt(s[i]);

        HashMap<Integer, ArrayList<Pair>> map = new HashMap<>();
        for(int i = 0; i<n; i++) {
            int sum = 0;
            for(int j = i; j>=0; j--) {
                sum += arr[j];
                ArrayList<Pair> list = map.get(sum);
                if(list == null) {
                    list = new ArrayList<>();
                    map.put(sum, list);
                }
                list.add(new Pair(j, i));
            }
        }

        Iterator it = map.entrySet().iterator();
        ArrayList<Pair> ans = new ArrayList<>();
        for(;it.hasNext();){
            Map.Entry<Integer, ArrayList<Pair>> entry = (Map.Entry<Integer, ArrayList<Pair>>)it.next();
            ArrayList<Pair> list = entry.getValue();
            ArrayList<Pair> pre = new ArrayList<>();
            int r = -1;
            for(Pair p : list) {
                if(p.f > r) {
                    pre.add(p);
                    r = p.s;
                }
            }
            if(ans.size()<pre.size()) ans = pre;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(ans.size()).append('\n');
        for(Pair p : ans) {
            sb.append(p.f+1).append(' ').append(p.s+1).append('\n');
        }
        System.out.print(sb);
    }
}