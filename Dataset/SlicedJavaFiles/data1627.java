public class Main{    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int n = Integer.parseInt(br.readLine());

        ArrayList<String> a = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            a.add(br.readLine());
        }

        if(solve(n, a)){
            out.println("YES");
            for (String s : a) {
                out.println(s);
            }
        }
        else
            out.println("NO");

        out.flush();
        out.close();
    }
}