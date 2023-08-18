public class Main{    public static void main(String[] args) throws Exception {
        Parserdoubt2333 s = new Parserdoubt2333(System.in);
        
        int n = s.nextInt();
        int k = s.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
            
        }
        
        TreeMap<Integer, Integer> tree = new TreeMap<Integer,Integer>();
        
        int left = 0;
        int right = 0;
        
        for (right = 0; right < a.length; right++) {
            if(tree.containsKey(a[right]))
                tree.put(a[right], tree.get(a[right]) + 1);
            else 
                tree.put(a[right],1);
            if(tree.size() == k)
                break;
        }
        
        if(tree.size() < k){
            System.out.println("-1 -1");
            return ;
        }
//      System.out.println(right);
        for (left = 0; left < a.length; left++) {
            int val = tree.get(a[left]);
            val--;
            if(val > 0)
                tree.put(a[left],val);
            if(val == 0)
                break;
            
        }
        left++;
        right++;
        System.out.println(left + " "+right);
    }
}