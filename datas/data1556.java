public class Main{    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int num = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");

        if (k == 1) System.out.println(num); 
        else {
            Set<Integer> set = new TreeSet<Integer>();
            Set<Integer> bad = new TreeSet<Integer>();
            int sel;
            
            int[] arr = new int[num];
            for (int i = 0; i < num; i++) {
                arr[i] = Integer.parseInt((st.nextToken()));
            }

            shuffle(arr);
            Arrays.sort(arr);

            for (int i = 0; i < num; i++) {
                sel = arr[i];
                if (sel % k != 0) {
                    set.add(sel);
                    bad.add(sel * k);
                }
                if (!bad.contains(sel) && !set.contains(sel / k)) {
                    bad.add(sel * k);
                    set.add(sel);
                }
            }

            System.out.println(set.size()); 
        }
    }
}