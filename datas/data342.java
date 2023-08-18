public class Main{    public static void main(String[] args) throws IOException {
        int n = nextInt();
        char[] s = nextString().toCharArray();
        int h = 0;
        for (int i = 0; i < n; i++)
            if (s[i] == 'H')
                h++;
        
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int p = i, t = 0;
            for (int j = 0; j < h; j++, p = (p+1)%n)
                if (s[p] == 'T')
                    t++;
            ans = Math.min(ans, t);
        }
        
        out.println(ans);
        out.flush();
    }
}