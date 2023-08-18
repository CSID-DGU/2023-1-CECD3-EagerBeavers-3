public class Main{    public static void main(String[] args) throws IOException {
        //Scanner f = new Scanner(new File("uva.in"));
        //Scanner f = new Scanner(System.in);
        //BufferedReader f = new BufferedReader(new FileReader("uva.in"));
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        int t = Integer.parseInt(f.readLine());
        while(t-- > 0) {
            int n = Integer.parseInt(f.readLine());
            nodes = new HashMap<>();
            nodes.put("", 0);
            String cur = "";
            for(int i = 0; i < n; i++) {
                int a = Integer.parseInt(f.readLine());
                while(nodes.get(cur) != a-1) {
                    cur = cur.substring(0, cur.lastIndexOf("."));
                }
                nodes.put(cur, a);
                cur = cur+"."+a;
                nodes.put(cur, 0);
            }
            dfs("", out);
        }
        f.close();
        out.close();
    }
}