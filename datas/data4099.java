public class Main{  public static void main(String[] args) {
    vec2 cen = new vec2(in.nextInt(),in.nextInt());
    n = in.nextInt();
    cost = new int[n][n];
    vec2[] v = new vec2[n];
    for(int i=0; i<n; i++)
      v[i] = new vec2(in.nextInt(),in.nextInt());
    for(int i=0; i<n; i++)
      for(int j=0; j<n; j++)
        cost[i][j] = v[i].dist(cen) + v[i].dist(v[j]) + v[j].dist(cen);
    memo = new int[1<<n];
    bb = new int[1<<n];
    Arrays.fill(memo,-1);
    out.println(go(0));
    build(0);
    out.close();
  }
}