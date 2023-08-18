public class Main{    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in), 1024 * 48);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        long x = Long.parseLong(st.nextToken());
        long k = Long.parseLong(st.nextToken());
        if (x == 0) {
            bw.write(0 + "\n");
        } else {
            int power = power(k, 1000000007);
            long answer = (((power * 2) % 1000000007) * (x % 1000000007)) % 1000000007;
            answer -= power - 1;
            answer = (answer + 1000000007) % 1000000007;
            bw.write(answer + "\n");
        }
        bw.flush();
    }
}