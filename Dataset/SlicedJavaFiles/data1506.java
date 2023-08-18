public class Main{  public static void main(String[] aslkdjlkgja) throws IOException
  {
    Codeforces z = new Codeforces();
    z.init("", "");
   
    long l = z.nL();
    long r = z.nL();
    if ( l == r)
    {
      System.out.println(0);
      z.close();
      return;
    }
    
    List<Boolean> R = new ArrayList<Boolean>();
    List<Boolean> L = new ArrayList<Boolean>();
    
    long temp = r;
    while (temp != 0)
    {
      if (temp % 2 == 1)
        R.add(true);
      else
        R.add(false);
      temp /= 2;
    }
    
    Collections.reverse(R);
    
    temp = l;
    while (temp != 0)
    {
      if (temp % 2 == 1)
        L.add(true);
      else
        L.add(false);
      temp /= 2;
    }    
    
    int n = R.size() - L.size();
    while (n!=0)
    {
      L.add(false);
      --n;
    }
    Collections.reverse(L);
    
    List<Boolean> res = new ArrayList<Boolean>();
   // for (int i = 0 ; i < R.size(); ++i)
     // res.add(false);
    
    int it = 0;
    
    while (R.get(0) == L.get(0))
    {
      res.add(false);
      R.remove(0);
      L.remove(0);
    }
    
    for (int i = 0; i< R.size(); ++i)
      res.add(true);
    
    long out = 0;
    it = 0;
    long add = 1;
    Collections.reverse(res);
    while (it < res.size())
    {
      if (res.get(it))
        out += add;
      add *= 2;
      ++it;
    }
    System.out.println(out);
  }
}