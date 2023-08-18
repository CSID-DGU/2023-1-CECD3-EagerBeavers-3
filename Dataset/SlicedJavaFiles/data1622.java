public class Main{    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        BIT invert = new BIT(n+5);
        BIT neg = new BIT(n+5);
        long res = 0;
        int[] arr = new int[n];
        boolean[] has = new boolean[n+1];
        long num1 = 0;
        for(int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
            if(arr[i] != -1) {
                res += invert.read(n+5)-invert.read(arr[i]);
                res %= MOD;
                invert.update(arr[i], 1);
                has[arr[i]] = true;
            } else num1++;
        }
        if(num1 == 0) {
            System.out.println(res);
            return;
        }
        for(int i = 1; i <= n; i++) if(!has[i]) neg.update(i, 1);
        long invertNum1 = modInv(num1, MOD);
        res += ((num1*(num1-1))%MOD)*modInv(4, MOD);
        res %= MOD;
        long cnt = 0;
        for(int i = 0; i < n; i++) {
            if(arr[i] == -1) {
                cnt++;
                continue;
            }
            res += (((neg.read(n+5)-neg.read(arr[i]))*cnt)%MOD)*invertNum1;
            res %= MOD;
        }
        cnt = 0;
        for(int i = n-1; i >= 0; i--) {
            if(arr[i] == -1) {
                cnt++;
                continue;
            }
            res += (((neg.read(arr[i]))*cnt)%MOD)*invertNum1;
            res %= MOD;
        }
        System.out.println(res);
    }
}