public class Main{    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //int[] x = {1,2,3,4,5,6,7,8,9,10};

        int N = Integer.parseInt(br.readLine());
        int[] d = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            d[i] = Integer.parseInt(st.nextToken());
        }
        boolean cur = ((inv(d)) % 2) == 1;
        // System.out.println(cur);
        int Q = Integer.parseInt(br.readLine());
        for (int i = 0; i < Q; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int dif = b - a + 1;
            if (dif / 2 % 2 == 1) {
                cur = !cur;
            }

            System.out.println((cur) ? "odd" : "even");
        }

//        for (int i = 0; i < 30; i++) {
//            int[] x = new int[i];
//            for (int j = 0; j < i; j++) {
//                x[j] = j + 1;
//            }
//            int[] y = new int[x.length];
//            for (int k = 0; k < x.length; k++) {
//                y[x.length - 1 - k] = x[k];
//            }
//
////            System.out.println(inv(x));
////            System.out.println(inv(y));
//            System.out.println(i + " " + ((inv(y) - inv(x))%2 == 1));
//        }
    }
}