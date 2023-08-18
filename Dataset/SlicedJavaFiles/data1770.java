public class Main{    public static void main(String[] args) {
    Scanner cin = new Scanner(System.in);
    int ret = 2, del;
    int n = cin.nextInt();
    int t = cin.nextInt() * 2;
    node = new Node[n];
    for (int i = 0; i < n; i++) {
        int x = cin.nextInt();
        int a = cin.nextInt();
        node[i] = new Node(x * 2 - a, x * 2 + a);
    }
    Arrays.sort(node);
    for (int i = 1; i < n; i++) {
        del = node[i].l - node[i - 1].r;
        if (del > t) {
        ret += 2;
        } else if (del == t) {
        ret++;
        }
    }
    System.out.println(ret);
    }
}