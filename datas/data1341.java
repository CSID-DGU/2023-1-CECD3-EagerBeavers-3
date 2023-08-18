public class Main{    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        n = nextLong();

        rect1 = find();
        rect2 = find();
        print("! " + arr(rect1) + " "
                   + arr(rect2));
        System.out.flush();
    }
}