public class Main{    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        int n = nextInt();
        int a = nextInt();
        int b = nextInt();
        List<Integer> nums = nextInts(n);
        solve(a, b, nums);
    }
}