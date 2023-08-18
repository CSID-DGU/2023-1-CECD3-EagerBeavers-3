public class Main{    public static void main(String[] args) {
        n = cin.nextLong(); m = cin.nextLong(); k = cin.nextLong();
        l = (k - 1)*(n / k) + n % k;
        if(m <= l) {
            System.out.println(m);
        }
        else {
            t = n / k;
            u = m - l;
            ans = (0 + (t - u) * (k - 1) + n % k) % Mod;
            ans = (ans + ((k)*((multi_mod(2, u + 1) - 2 + Mod) % Mod)) % Mod) % Mod;
            System.out.println(ans);
        }
    }
}