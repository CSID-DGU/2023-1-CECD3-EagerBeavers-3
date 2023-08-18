public class Main{    public static void main(String[] args) throws java.io.IOException {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;++i)
            {
                arr[i]=sc.nextInt();
            }
            ArrayList<Integer> cur=new ArrayList<>();
            cur.add(1);
            System.out.println(1);
            for(int i=1;i<n;++i)
            {
                if(arr[i]==1)
                {
                    cur.add(1);
                    pri(cur);
                    continue;
                }
                int len=cur.size();
                while(cur.get(len-1)!=arr[i]-1)
                {
                    cur.remove(len-1);
                    len--;
                }
                cur.set(len-1,arr[i]);
                pri(cur);
                continue;
            }
        }
    }
}