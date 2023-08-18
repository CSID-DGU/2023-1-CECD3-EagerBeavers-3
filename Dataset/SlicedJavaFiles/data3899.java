public class Main{    public static void main(String[] args){
        FastScanner in = new FastScanner();
        FastWriter out = new FastWriter();
        Scanner sc=new Scanner(System.in);
        int t=in.nextInt();
        //int t=1;
        while (t-->0){
            int n=in.nextInt();
            int[] ar=in.nextArray(n);
            int[] level=new int[1005];
            int j=1;
            level[1]=1;
            out.println(1);
            for (int i = 1; i < n; i++) {
                if(ar[i]==1) {
                    j++;
                    level[j] = 1;
                }else {
                    while (j>=1){
                        if(level[j]+1!=ar[i]){
                            j--;
                        }else {
                            break;
                        }
                    }
                    level[j]++;
                }
                for (int k = 1; k <= j; k++) {
                    if(k==j){
                        out.print(level[k]);
                    }else {
                        out.print(level[k]+".");
                    }
                }
                out.println();
            }
        }
        out.close();
    }
}