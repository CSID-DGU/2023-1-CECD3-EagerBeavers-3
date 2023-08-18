public class Main{    public static void main(String[] s) throws Exception {
        StringBuilder stringBuilder = new StringBuilder();

//        stringBuilder.append("7 3\n" +
//                "1 5 2 6 3 7 4\n" +
//                "2 5 3\n" +
//                "4 4 1\n" +
//                "1 7 3");

//
//        Random r = new Random(5);
//        stringBuilder.append("100000 5000 ");
//        for (int i = 0; i < 100000; i++) {
//            stringBuilder.append(" " + (r.nextInt(2000000000) - 1000000000) + " ");
//
//        }
//        for (int k = 0; k < 5000; k++) {
//            stringBuilder.append(" 1 100000 777 ");
//        }
        if (stringBuilder.length() == 0) {
            sc = new MyScanner(System.in);
        } else {
            sc = new MyScanner(new BufferedReader(new StringReader(stringBuilder.toString())));
        }

        out = new PrintWriter(new OutputStreamWriter(System.out));

        initData();
        solve();

        out.flush();
    }
}