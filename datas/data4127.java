public class Main{  public static void main(String[] args) throws Exception {
    Reader.init(System.in);
    BufferedWriter cout = new BufferedWriter(new OutputStreamWriter(System.out));

    x[0] = Reader.nextInt();
    y[0] = Reader.nextInt();
    n = Reader.nextInt();
    for (int i=1; i<=n; i++) {
      x[i] = Reader.nextInt();
      y[i] = Reader.nextInt();
    }
    for (int i=0; i<=n; i++)
      for (int j=0; j<=n; j++)
        dist[i][j] = sqr(x[i] - x[j]) + sqr(y[i] - y[j]);
    
    int[] f = new int[1 << n];
    int[] r = new int[1 << n];
    for (int mask=1; mask<(1 << n); mask++) {
      int lowbit = mask & -mask;
      int lowbitPos = bitPos[lowbit % M];
      f[mask] = dist[lowbitPos + 1][0] * 2 + f[mask ^ lowbit];
      r[mask] = lowbit;
        for (int i=mask^(lowbit); i>0; i=i^(i & -i)) {
          int otherBit = i & -i;
          int otherBitPos = bitPos[otherBit % M];
          int tmp = dist[0][lowbitPos + 1] + dist[lowbitPos + 1][otherBitPos + 1] + dist[otherBitPos + 1][0] + f[mask ^ otherBit ^ lowbit];
          if (tmp < f[mask]) {
            f[mask] = tmp;
            r[mask] = lowbit | otherBit;
          }
      }
    }
    
    System.out.println(f[(1 << n) - 1]);
    int mask = (1 << n) - 1;
    while(mask > 0) {
      if ((r[mask] ^ (r[mask] & -r[mask])) == 0) {
        System.out.print("0 " + (bitPos[r[mask] % M] + 1) + " ");
      }
      else {
        int bit1 = r[mask] & -r[mask];
        int bit2 = r[mask] ^ bit1;
        System.out.print("0 " + (bitPos[bit1 % M] + 1) + " " + (bitPos[bit2 % M] + 1) + " ");
      }
      mask ^= r[mask];
    }
    System.out.println("0");
      
    cout.close();
  }
}