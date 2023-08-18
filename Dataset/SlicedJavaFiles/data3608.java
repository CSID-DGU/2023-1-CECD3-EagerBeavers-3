public class Main{    public static void main(String[] args) throws IOException {
        File f = new File("input.txt");
        Scanner sc = new Scanner(f);
        BufferedWriter bw = new BufferedWriter(new FileWriter(new File("output.txt")));
        int n = sc.nextInt();
        int m = sc.nextInt();
        boolean[][] board = new boolean[n][m];
        int count = sc.nextInt();
        Point[] burningTrees = new Point[count];
        for (int i=0; i<count; i++) {
            burningTrees[i] = new Point(sc.nextInt() - 1,sc.nextInt() - 1);
        }
        Point last = findLastPoint(board,burningTrees);
        bw.append((last.x + 1) + " " + (last.y + 1) + "\n");
        bw.flush();
        bw.close();
        sc.close();
    }
}