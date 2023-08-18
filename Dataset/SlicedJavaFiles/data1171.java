public class Main{    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine());
        long s = Long.parseLong(st.nextToken());
        long n = Long.parseLong(st.nextToken());
        BSearch2(1, s, n);
        if (sum == 0) System.out.println("0");
        else System.out.println(s - sum + 1);

    }
}