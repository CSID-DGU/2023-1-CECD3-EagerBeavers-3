public class Main{    public static void main(String[] args) throws IOException {
        int n = rni(), m = ni(), cnt[][] = new int[m][m], dp[] = new int[1 << m], all = (1 << m) - 1;
        char[] s = rcha();
        for (int i = 1; i < n; ++i) {
            ++cnt[s[i] - 'a'][s[i - 1] - 'a'];
            ++cnt[s[i - 1] - 'a'][s[i] - 'a'];
        }
        fill(dp, IBIG);
        dp[0] = 0;
        int cnt_bit[] = new int[1 << m], min_bit[] = new int[1 << m], d[][] = new int[1 << m][m];
        for (int mask = 1; mask <= all; ++mask) {
            cnt_bit[mask] = 1 + cnt_bit[mask & (mask - 1)];
            for (int i = 0; i < n; ++i) {
                if ((mask & (1 << i)) > 0) {
                    min_bit[mask] = i;
                    break;
                }
            }
        }
        for (int mask = 1; mask <= all; ++mask) {
            for (int i = 0; i < m; ++i) {
                d[mask][i] = d[mask ^ (1 << min_bit[mask])][i] + cnt[i][min_bit[mask]];
            }
        }
        for (int mask = 0; mask <= all; ++mask) {
            for (int i = 0; i < m; ++i) {
                if ((mask & (1 << i)) > 0) {
                    continue;
                }
                int pos = cnt_bit[mask], next = mask | (1 << i);
                dp[next] = min(dp[next], dp[mask] + pos * (d[mask][i] - d[all ^ next][i]));
            }
        }
        prln(dp[all]);
        close();
    }
}