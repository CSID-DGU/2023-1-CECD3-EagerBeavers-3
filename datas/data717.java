public class Main{    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCount = in.nextInt();
        for (int test = 0; test < testCount; test++) {
            String src = in.next();
            if (src.matches("^R\\d+C\\d+$")) {
                Pattern p = Pattern.compile("\\d+");
                Matcher m = p.matcher(src);
                m.find();
                int r = Integer.parseInt(m.group(0));
                m.find();
                int c = Integer.parseInt(m.group(0));
                System.out.println(toBase26(c) + r);
            } else {
                Pattern p = Pattern.compile("[A-Z]+");
                Matcher m = p.matcher(src);
                m.find();
                String c = m.group(0);
                p = Pattern.compile("\\d+");
                m = p.matcher(src);
                m.find();
                int r = Integer.parseInt(m.group(0));
                System.out.println("R" + r + "C" + toBase10(c));
            }
        }
    }
}