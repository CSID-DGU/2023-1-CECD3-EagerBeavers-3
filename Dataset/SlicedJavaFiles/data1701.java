public class Main{    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), t = 2 * scanner.nextInt();
        if (1 == n) {
            System.out.println(2);
        } else {
            int rez = 2;
            ArrayList<Entity> list = new ArrayList<Entity>();
            for (int i = 0; i < n; i++) {
                list.add(new Entity(scanner.nextInt(), scanner.nextInt()));
            }
            Collections.sort(list);
            for (int i = 1; i < n; i++) {
                int num = 2 * (list.get(i).x - list.get(i - 1).x)
                        - list.get(i).a - list.get(i - 1).a;
                if (t < num) {
                    rez += 2;
                } else if (t == num) {
                    rez++;
                }
            }
            System.out.println(rez);
        }
    }
}