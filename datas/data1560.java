public class Main{    public static void main(String[] args) throws Exception {
        int numCnt = (int) nextLong();
        long k = nextLong();
        parent = new int[numCnt];
        for (int i = 0; i < parent.length; i++) {
            parent[i] = i;
        }
        Long[] ar=new Long[numCnt];
        for (int i = 0; i < numCnt; i++) {
            ar[i] = nextLong();
        }
        Arrays.sort(ar);
        for (int i = 0; i < ar.length; i++) {
            long req = ar[i] * k;
            int l=0,h=ar.length,mid;
            while(l<h){
                mid=l+(h-l)/2;
                if(ar[mid]<req){
                    l=mid+1;
                }else{
                    h=mid;
                }
            }
            if(l<ar.length&&ar[l]==req){
                union(i,l);
            }
        }
        int[] count = new int[numCnt];
        for (int i = 0; i < parent.length; i++) {
            count[find(i)]++;
        }
        int res = 0;
        for (int i = 0; i < numCnt; i++) {
            res += (int) ((count[i] + 1) / 2.0);
        }
        System.out.println(res);
    }
}