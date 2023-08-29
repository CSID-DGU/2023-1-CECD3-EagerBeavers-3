public class Main{    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer split = new StringTokenizer(in.readLine());
        int n = Integer.parseInt(split.nextToken());
        double t = Double.parseDouble(split.nextToken());

        House[] xaxis = new House[n];

        for (int i = 0; i < n; i++) {
            split = new StringTokenizer(in.readLine());
            xaxis[i] = new House(Double.parseDouble(split.nextToken()), Double.parseDouble(split.nextToken()));
        }
        Arrays.sort(xaxis);
        int count = 2;
        for (int i = 0; i < xaxis.length - 1; i++) {
            double free = (xaxis[i + 1].getX() - xaxis[i + 1].getSize() / 2.0) - (xaxis[i].getX() + xaxis[i].getSize() / 2.0);
            if (free / t == 1.0) {
                count++;
            } else if (free / t > 1.0) {
                count += 2;
            }
        }

        System.out.println(count);
    }
}