public class Main{    public static void main(String[] args) throws IOException {
        Fire_Again fire_again = new Fire_Again();
        BufferedReader bufferedReader =
                new BufferedReader(new FileReader("input.txt"));
        String[] nm = bufferedReader.readLine().split(" ");
        N = Integer.parseInt(nm[0]) + 1;
        M = Integer.parseInt(nm[1]) + 1;
        K = Integer.parseInt(bufferedReader.readLine());
        used = new boolean[N][M];
        String[] rc = bufferedReader.readLine().split(" ");
        for(int k = 0;k < rc.length;k+=2) {
            int r = Integer.parseInt(rc[k]);
            int c = Integer.parseInt(rc[k+1]);
            pos.add(fire_again.new Pos(r,c,0));
        }
        fire_again.bfs();
        PrintStream ps = new PrintStream("output.txt");
        ps.printf("%d %d\n",fire_again.lastRow,fire_again.lastCol);
        ps.flush();
        ps.close();
    }
}