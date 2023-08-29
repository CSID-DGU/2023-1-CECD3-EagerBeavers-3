public class Main{    public static void main(String[] args) throws IOException {
        FastScanner in = new FastScanner();
        int n = in.nextInt();
        
        double r = (double) in.nextInt();
        double[] answers = new double[n];
        double[] xCoords = new double[n];
        for (int i = 0; i < n; i++) xCoords[i] = (double) in.nextInt();
        
        answers[0] = r;
        for (int i = 1; i < n; i++) {
            double bound = r;
            for (int j = 0; j < i; j++) {
                double xDif = xCoords[i] - xCoords[j];
                double y = answers[j];
                double yNew = y + Math.sqrt(4 * r * r - xDif * xDif);
                if (yNew > bound) bound = yNew;
            }
            answers[i] = bound;
        }
        for (int i = 0; i < n; i++) System.out.print(answers[i] + " ");
        System.out.println();
    }
}