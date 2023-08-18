public class Main{    public static void main(String[] args) {
        // BufferedReader in = new BufferedReader(new
        // InputStreamReader(System.in));
        InputReader in = new InputReader(System.in);
        int n = in.readInt();
        int a = in.readInt();
        int b = in.readInt();
        Integer[] inp = new Integer[n];
        for (int i = 0; i < inp.length; i++) {
            inp[i] = in.readInt();
        }
        Arrays.sort(inp);
        int petya = inp[inp.length-a];
        int next = inp[inp.length-a-1];
        int diff = petya - next;
        System.out.println(diff);
    }
}