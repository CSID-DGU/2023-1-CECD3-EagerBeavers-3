public class Main{    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        //FileWriter f = new FileWriter("C:\\Users\\Ibrahim\\out.txt");
        PrintWriter pw = new PrintWriter(System.out);
         n = sc.nextInt();
        int t = sc.nextInt();
        gen= new int[n];
        val= new int[n];
        for (int i =0;i<n;i++){
            val[i]=sc.nextInt();
            gen[i]=sc.nextInt();
        }
        memo= new int[4][t+1][1<<n];
        for (int[][]x:memo)for (int[]a:x)Arrays.fill(a,-1);
        pw.println(dp(0,t,0));
        pw.flush();
    }
}