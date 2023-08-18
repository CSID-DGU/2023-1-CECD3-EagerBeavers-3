public class Main{    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] line = reader.readLine().split(" ");
        int w = Integer.valueOf(line[0]);
        int h = Integer.valueOf(line[1]);
        int n = Integer.valueOf(line[2]);

        Request[] requests = new Request[n];

        for (int i = 0; i < n; i++) {
            line = reader.readLine().split(" ");
            requests[i] = new Request(line[0], Integer.valueOf(line[1]));
        }

        for (long e : solve(h, w, requests))
            System.out.println(e);

//        int w = 200000, h = 200000, n = 400000;
//        Request[] requests = generate(w, h, n);
//
//        long start = System.currentTimeMillis();
//        solve(h, w, requests);
//        long end = System.currentTimeMillis();
//
//        System.out.println("Time: " + (end - start) + " ms");
    }
}