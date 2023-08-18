public class Main{    public static void main(String[] args) {

        InputReader in = new InputReader();
        int N = in.nextInt();
        int arr[] = new int[N];

        for (int i = 0; i < N; i++)
            arr[i] = in.nextInt();

        HashMap<Integer, ArrayList<Pair>> name = new HashMap<>();

        for (int i = 0; i < N; i++) {
            int sum = 0;
            for (int j = i; j < N; j++) {
                sum += arr[j];
                if (name.get(sum) == null)
                    name.put(sum, new ArrayList());

                name.get(sum).add(new Pair(i+1, j+1));
            }
        }

        HashSet<Pair> ans = new HashSet<>();

        for (ArrayList<Pair> n : name.values()) {
            Collections.sort(n, new Comparator<Pair>() {
                @Override
                public int compare(Pair o1, Pair o2) {
                    if (Integer.compare(o1.b, o2.b) == 0)
                        return Integer.compare(o1.a, o2.a);
                    return Integer.compare(o1.b, o2.b);
                }
            });


            HashSet<Pair> temp = new HashSet<>();
            temp.add(n.get(0));
            int num = 1;
            int r = n.get(0).b;

            for (int i = 1; i < n.size(); i++) {

                if (n.get(i).a > r) {
                    num++;
                    r = n.get(i).b;
                    temp.add(n.get(i));
                }
            }


            if (num > ans.size())
                ans = temp;
        }

        System.out.println(ans.size());
        for (Pair val : ans)
            System.out.println(val.a + " " + val.b);


    }
}