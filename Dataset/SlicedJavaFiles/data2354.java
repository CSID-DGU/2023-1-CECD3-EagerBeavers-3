public class Main{    public static void main(String[] args) throws IOException {
        Reader.init(System.in);
        int n = Reader.nextInt();
        int[] arr = new int[n];
        int initial = 0;
        for (int i = 0; i < n; i++) arr[i] = Reader.nextInt();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) if (arr[i] > arr[j]) initial++;
        }

        int m = Reader.nextInt();
        boolean parity = initial % 2 == 0;
//        System.out.println(parity ? "even": "odd");
        for (int i = 0; i < m; i++) {
            int l = Reader.nextInt();
            int r = Reader.nextInt();
            int elems = r - l + 1;
            boolean change = (elems/2) % 2 == 0;
            parity = parity == change;
            System.out.println(parity ? "even": "odd");
        }
    }
}