public class Main{    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        
        int n = r.nextInt();
        int m = r.nextInt();
        
        if(n > m){int t = n; n = m; m = t;}
        
        dp = new int[m+1][1 << 7][1 << 7];
        for(int[][] i : dp)
            for(int[] j : i)
                Arrays.fill(j, -1);
        int min = go(m, 0, (1<<n) -1, n, m);
        
        System.out.println(n * m - min);
    }
}