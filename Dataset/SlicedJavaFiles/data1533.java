public class Main{public static void main(String[] args) throws IOException
{
    input.init(System.in);
    int n = input.nextInt(), k = input.nextInt();
    TreeSet<Integer> ts = new TreeSet<Integer>();
    int[] data = new int[n];
    for(int i = 0; i<n; i++)
    {
        data[i] = input.nextInt();
    }
    Arrays.sort(data);
    if(n>1 && k==1.*data[n-1]/data[0])
        System.out.println(n-1);
    else
    {
    for(int i = 0; i<n; i++)
    {
        if(data[i]%k != 0)
            ts.add(data[i]);
        else
        {
            if(!ts.contains(data[i]/k))
                ts.add(data[i]);
        }
    }
    System.out.println(ts.size());
    }
}
}