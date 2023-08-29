public class Main{    public static void main(String[] args) throws IOException {
        // InputStreamReader stream = new InputStreamReader(System.in);
        // BufferedReader input = new BufferedReader(stream);

        BufferedReader input = new BufferedReader(new FileReader("input.txt"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));

        StringTokenizer dataR = new StringTokenizer(input.readLine());
        N = Integer.parseInt(dataR.nextToken());
        M = Integer.parseInt(dataR.nextToken());
        burning = new boolean[N+1][M+1];

        StringTokenizer dataR1 = new StringTokenizer(input.readLine());
        int K = Integer.parseInt(dataR1.nextToken());

        StringTokenizer dataR2 = new StringTokenizer(input.readLine());
        LitTrees = new LinkedList<int[]>();
        for (int j = 0; j < K; j++){
            int x = Integer.parseInt(dataR2.nextToken());
            int y = Integer.parseInt(dataR2.nextToken());
            int[] coord = {x, y};
            LitTrees.add(coord);
            burning[x][y] = true;
        }

        // while(ExistsAliveTree()){
        //     spread();
        // }

        spread();

        // System.out.println(LitTrees.getLast()[0] + " " + LitTrees.getLast()[1]);
        out.println(lastTree[0] + " " + lastTree[1]);
        out.close();

    }
}