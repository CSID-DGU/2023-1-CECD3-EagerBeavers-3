public class Main{public static void main(String[] args) throws IOException
{
    input.init(System.in);
    int n = input.nextInt(), x = input.nextInt(), y = input.nextInt(),  c = input.nextInt();
    long lo = 0, hi = 2*n;
    while(hi > lo+1)
    {
        long mid = (hi+lo)/2;
        long covered = go(n, x, y, mid);
        if(covered < c)
            lo = mid;
        else hi = mid;
    }
    if(go(n, x, y, lo) < c) lo++;
    System.out.println(lo);
    
}
}