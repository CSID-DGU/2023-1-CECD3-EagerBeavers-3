public class Main{    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        team[] t = new team[n];
        for (int i = 0; i < n; i++)
            t[i] = new team(in.nextInt(), in.nextInt());
        Arrays.sort(t);
        int cnt = 0;
        team tm = t[t.length - k];
        for (int i = t.length - 1; i >= 0; i--)
            if (tm.equal(t[i]))
                cnt++;
        System.out.println(cnt);
    }
}