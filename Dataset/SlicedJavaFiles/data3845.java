public class Main{    public static void main(String[] args) {
        StringBuilder ans = new StringBuilder();
        int t = ri();
//        int t = 1;
        while (t-- > 0)
        {
            int n=ri();
            int[] arr=rai(n);

            List<Integer> list = new ArrayList<>();
            for(int i:arr)
            {
                if(i==1)
                {
                    list.add(i);
                }
                else
                {
                    int ind = list.size()-1;
                    while(list.size()>0 && list.get(ind)+1!=i )
                    {
                        list.remove(list.size()-1);
                        ind=list.size()-1;
                    }
                    if(list.size()>0)
                    {
                        list.remove(list.size()-1);
                    }
                    list.add(i);
                }

                for(int j=0;j<list.size()-1;j++)
                {
                    ans.append(list.get(j)).append(".");
                }
                ans.append(list.get(list.size()-1)).append("\n");
            }
        }
        out.print(ans.toString());
        out.flush();
    }
}