public class Main{    public static void main(String[] args) throws Exception {
        st = new StringTokenizer(reader.readLine());
        long n = Long.parseLong(st.nextToken());
        long k = Long.parseLong(st.nextToken());
        long put = (-3 + (long)Math.sqrt((long)9 + 8 * k + 8 * n)) / 2;
        long eat = n - put;
        writer.write(Long.toString(eat));
        writer.newLine();
        writer.flush();
    }
}