public class Main{    public static void main(String[] args) throws IOException {
        MyInputReader in = new MyInputReader(System.in);
        HashMap<Character, Integer> m = new HashMap<Character, Integer>();
        int n = in.nextInt();
        char[] s = in.next().toCharArray();

        for (int i = 0; i < n; i++) {
            m.put(s[i], 0);
        }
        int mx = m.size();
        int start = 0;
        int end = 0;
        int min = Integer.MAX_VALUE;
        int cur = 0;
        while (end < n) {
            while (end < n && cur != mx) {
                int x = m.get(s[end]);
                if (x == 0) {
                    cur += 1;
                }
                m.put(s[end], x + 1);
                end += 1;
            }
            while (start <= end && cur == mx) {
                int x = m.get(s[start]);
                m.put(s[start], x - 1);
                if (x - 1 == 0) {
                    cur -= 1;
                }
                start += 1;
            }
            min = Math.min(min, end - start + 1);
        }
        System.out.println(min);
    }
}