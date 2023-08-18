public class Main{    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap();
        map.put(0,1);
        int n = nextInt();
        int m = nextInt();
        int index = -1;
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i]=nextInt();
            if(a[i]==m)
                index=i;
        }
        int sum = 0;
        for(int i=0;i<index;i++){
            if (a[i]<m)
                sum--;
            else
                sum++;
            if (map.containsKey(sum)){
                map.put(sum,map.get(sum)+1);
            }else {
                map.put(sum,1);
            }
        }
        long ans = 0;
        for(int i=index;i<n;i++){
            if (a[i]<m)
                sum--;
            else if(a[i]>m)
                sum++;
            if (map.containsKey(sum))
                ans+=map.get(sum);
            if (map.containsKey(sum-1))
                ans+=map.get(sum-1);
        }
        out.print(ans);
        out.flush();
    }
}