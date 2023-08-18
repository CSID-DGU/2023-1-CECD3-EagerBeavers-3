public class Main{    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        PrintWriter out = new PrintWriter("output.txt");
        String [] use = null;
        use = br.readLine().split(" ");
        N = parseInt(use[0]);
        M = parseInt(use[1]);
        int K = parseInt(br.readLine());
        use = br.readLine().split(" ");
        for(int i = 0 ; i < 2 * K ; i += 2){
            int f = parseInt(use[i]) - 1;
            int t = parseInt(use[i + 1]) - 1;
            bfs.offer(new state(f, t, 0));
        }
        Point ans = runBFS();
        out.println(ans.x + " " + ans.y);
        out.flush();
        out.close();
    }
}