public class Main{    public static void main(String[] args) {
        reader = new BufferedReader(new InputStreamReader(System.in));

        int height = nextInt(), width = nextInt();
        if (width > height) {
            int t = width;
            width = height;
            height = t;
        }

        final int INF = height * width + 10;
        final int ALL_BITS = (1 << width)  - 1;
        int[][][] dp = new int[height + 1][1 << width][1 << width];
        for (int[][] ints : dp) {
            for (int[] anInt : ints) {
                Arrays.fill(anInt, INF);
            }
        }

        dp[0][0][0] = 0;
        for(int r = 0; r < height; ++r) {
            for(int uncovered = 0; uncovered < (1 << width); ++uncovered) {
                for(int mask = 0; mask < (1 << width); ++mask) {
                    if (dp[r][uncovered][mask] == INF) {
                        continue;
                    }

                    for(int curMask = uncovered; curMask < (1 << width); curMask = (curMask + 1) | uncovered) {
                        int curCovered = (mask | curMask);
                        curCovered |= (curMask >> 1);
                        curCovered |= (ALL_BITS & (curMask << 1));

                        int curUncovered = ALL_BITS ^ curCovered;
                        dp[r+1][curUncovered][curMask] = Math.min(dp[r+1][curUncovered][curMask], dp[r][uncovered][mask] + Integer.bitCount(curMask));
                    }
                }
            }
        }

        int res = INF;
        for(int x: dp[height][0]) res = Math.min(res, x);

        System.out.println(height * width - res);
    }
}