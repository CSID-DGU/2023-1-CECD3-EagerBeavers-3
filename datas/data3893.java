public class Main{	public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int t = sc.nextInt();
        for(int i=0;i<t;i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int j=0;j<n;j++) arr[j] = sc.nextInt();
            deal(n,arr);
        }
        out.close();
    }
}