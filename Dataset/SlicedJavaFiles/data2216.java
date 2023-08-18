public class Main{    public static void main(String[] args)throws Exception {
        FastReader in = new FastReader(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        n = in.nextInt();
        
        int brr[] = new int[2*n];
        for (int i = 0; i < 2*n; i+= 2) {
            brr[i] = in.nextInt();
            brr[i+1] = in.nextInt();
        }

        arr = shrink(brr);
        int imap[] = new int[2*n];
        for (int i = 0; i < 2*n; i++) {
            imap[arr[i]] = brr[i];
        }

        int idx = binarySearch(arr.length);
        if(idx >= arr.length) pw.println(-1);
        else pw.println(imap[idx]);

        pw.close();
    }
}