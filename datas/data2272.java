public class Main{    public static void main(String[] args) throws Exception {
        MyReader reader = new MyReader(System.in);
//        MyReader reader = new MyReader(new FileInputStream("input.txt"));
        MyWriter writer = new MyWriter(System.out);
        new Solution().run(reader, writer);
        writer.close();
    }
}