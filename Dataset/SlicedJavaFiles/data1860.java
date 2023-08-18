public class Main{    public static void main(String[] args) throws FileNotFoundException
    {
        in = new InputReader(System.in);
        out = new PrintWriter(System.out);            
        
        int n = in.nextInt();
        int[] arr = in.nextIntArray(n);
        ArrayList<Integer>list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i = 0; i < n; i++){
            list.add(arr[i]);
            list.add(arr[i] + 1);
            list.add(arr[i] - 1);
        }
        Collections.sort(list);
        int j = 1;
        for(int k : list){
            if(map.containsKey(k)) continue;
            map.put(k, j++);
        }
        
        SegmentTree seg = new SegmentTree(j + 1);
        SegmentTree seg1 = new SegmentTree(j + 1);
        BigInteger ans = BigInteger.ZERO;
        BigInteger sum = BigInteger.ZERO;
//        long ans = 0;
//        long sum = 0;
        for(int i = 0; i < n; i++){
            long x = seg.get(0, j - 1, map.get(arr[i] - 1), map.get(arr[i] + 1), 1);
            long y = seg1.get(0, j - 1, map.get(arr[i] - 1), map.get(arr[i] + 1), 1);
            ans = ans.add(new BigInteger(""+x));
            ans = ans.subtract(sum);
            ans = ans.add(new BigInteger(""+((arr[i] * 1l *(i - y)))));
//              ans += arr[i] * 1l * (i - y) - sum + x;
            
            seg.update(0, j - 1, map.get(arr[i]), map.get(arr[i]), arr[i], 1);
            seg1.update(0, j - 1, map.get(arr[i]), map.get(arr[i]), 1, 1);
            sum = sum.add(new BigInteger(arr[i] + ""));
        }
        
        out.println(ans);
        out.close();
    }
}