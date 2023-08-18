public class Main{    public static void main(String[] args) throws IOException {
        OJ = System.getProperty("ONLINE_JUDGE") != null;
        G solution = new G(System.out);
        if (OJ) {
            reader = new BufferedReader(new InputStreamReader(System.in));
            solution.run();
        } else {
            reader = new BufferedReader(new FileReader(new File(G.class.getName() + ".txt")));
            long timeout = System.currentTimeMillis();
            while (solution.hasNext()) {
                solution.run();
                solution.println();
                solution.println("----------------------------------");
            }
            solution.println("time: " + (System.currentTimeMillis() - timeout));
        }
        solution.close();
        reader.close();
    }
}