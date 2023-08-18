public class Main{    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));


        int r = in.nextInt();
        int c = in.nextInt();
        boolean[][] m = new boolean[r + 1][c + 1];
        boolean[][] inp = new boolean[r + 1][c + 1];
        for (int i = 0; i < r; i++) {
            String s = in.next();
            //System.out.println(m[i]);
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == '#') {
                    m[i][j] = true;
                    inp[i][j] = true;
                }
            }
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (canPress(i, j, r, c, inp)) {

                    // make press
                    for (int k = 0; k < 8; k++) {
                        int xi = i + dx[k];
                        int yi = j + dy[k];
                        m[xi][yi] = false;
                    }

                }
            }
        }
        boolean isLeftAny = false;
        for (int i = 0; i < r && !isLeftAny; i++) {
            for (int j = 0; j < c && !isLeftAny; j++) {
                if (m[i][j]) {
                    isLeftAny = true;
                    break;
                }
            }
        }
        if(isLeftAny){
            System.out.println("NO");
        }else{
            System.out.println("YES");
        }
    }
}