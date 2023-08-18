public class Main{    public static void main(String[] args) throws IOException{
	    Scanner sc = new Scanner();
	    N = sc.nextInt();
        int [] val = new int[N];
        for(int i = 0; i < N; ++i)
            if(sc.next().charAt(0) == 's')
                val[i] = 0;
            else
                val[i] = 1;
        l = new ArrayList<Integer>();
        l.add(val[0]);

        for(int i = 1; i < N; ++i)
            if(val[i] == val[i - 1] && val[i] == 1) {
                int prev = l.get(l.size() - 1);
                l.set(l.size() - 1, ++prev);
            } else if(val[i - 1] == 0){
                l.add(val[i]);
            }

//        System.out.println(l);
        dp = new int[l.size() + 1][N + 1];
        for(int i = 0; i <= l.size(); ++i)
            Arrays.fill(dp[i], -1);
        System.out.println(f(0, 0));

    }
}