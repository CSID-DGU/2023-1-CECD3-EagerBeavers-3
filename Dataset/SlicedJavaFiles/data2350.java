public class Main{    public static void main(String[] args) {

        int n = scanInt();
        List<Integer> a = scanList(n);
        int m = scanInt();
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            left.add(scanInt());
            right.add(scanInt());
        }

        String even = "even";
        String odd = "odd";

        int inversions = 0;
        for (int i = 0; i < a.size(); i++) {
            for (int j = i; j < a.size(); j++) {
                if (a.get(i) > a.get(j)) {
                    ++inversions;
                }
            }
        }

        inversions = inversions % 2;
        for (int i = 0; i < m; i++) {
            inversions = (inversions + (right.get(i) - left.get(i) + 1) / 2 % 2) % 2;
            println(inversions % 2 == 0 ? even : odd);
        }


    }
}