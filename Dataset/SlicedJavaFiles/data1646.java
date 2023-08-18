public class Main{    public static void main(String[] args) throws Exception {
        in = new Scanner(System.in);
//      in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
//      in = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);
        int n = next();
        int a = next();
        int b = next();
        int k = 0;
        int i;
        int[] ar = new int[n];
        for(i=0;i<n;i++)
            ar[i]=next();
        Arrays.sort(ar);
        k = ar[n-a]-ar[b-1];
        if(k<0)
            out.print(0);
        else out.print(k);
        out.close();

    }
}