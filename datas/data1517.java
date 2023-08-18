public class Main{  public static void main(String[] args)
  throws IOException
  {
    FastReader fr = new FastReader();
    int n = fr.nextInt();
    int q = fr.nextInt();
    long[] a = new long[n];
    long[] k = new long[q];
    for(int i = 0; i < n; i++) a[i] = fr.nextLong();
    for(int i = 0; i < q; i++) k[i] = fr.nextLong();
    long[] pre = new long[n];
    pre[0] = a[0];
    for(int i = 1; i < n; i++) pre[i] = pre[i-1] + a[i];
    long pd = 0;
    for(int i = 0; i < q; i++)
    {
      int l = 0;
      int r = n - 1;
      while(r > l)
      {
        int mid = (l + r) >> 1;

        if(pre[mid] - pd < k[i])
        {
          l = mid + 1;
        }
        else if(pre[mid] - pd > k[i])
        {
          r = mid - 1;
        }
        else
        {
          l = r = mid;
        }
      }
      int ans = 0;
      if(pre[l] - pd <= k[i])
      {
        ans = n - l - 1;
      }
      else
      {
        ans = n - l;
      }
      if(ans == 0) ans  = n;
      pd = pd + k[i];
      if(pd >= pre[n-1]) pd = 0;
      System.out.println(ans);
    }
  }
}