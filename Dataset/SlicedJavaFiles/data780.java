public class Main{    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        char[] s = scanner.next().toCharArray();

        int[][] r = new int[n][54];

        Set<Character> chars = new HashSet<>();

        for (int i= 0 ;i < n; ++ i)chars.add(s[i]);

        List<Character> all = new ArrayList<>();

        for (Character c: chars)all.add(c);

        for (int i = n - 1; i >= 0; -- i){
            for (int j = 0;j < 54; ++ j){
                if (i == n - 1){
                    r[i][j] = -1;
                }else {
                    r[i][j] = r[i + 1][j];
                }
            }
            r[i][getCode(s[i])] = i;
        }

        int res = n;


        for (int i =0; i < n; ++ i){
            int mx = 1;
            boolean fl = false;
            for (Character c: all){
                if (r[i][getCode(c)] == -1){
                    fl = true;
                    break;
                }
                mx = Math.max(mx, r[i][getCode(c)] - i + 1);
            }
            if (fl){
                System.out.println(res);
                return;
            }
            res = Math.min(res, mx);
        }
        System.out.println(res);

        scanner.close();
        //reader.close();
    }
}