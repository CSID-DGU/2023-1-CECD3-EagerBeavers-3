public class Main{    public static void main(String[] args)throws IOException {
        /*
inputCopy
4
2 1 2 1
outputCopy
4
inputCopy
5
0 -1 -1 -1 -1
outputCopy
4
*/
        PrintWriter pw = new PrintWriter(System.out);
        FastReader fr = new FastReader();
        int n=fr.i();
        int [] arr=new int[n];
        fr.scanIntArr(arr);
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        long sum=0;
        if(n==1)
        {
            pw.println(arr[0]);
            pw.flush();
            pw.close();
            return;
        }
        for(int i=0;i<n;++i)
        {
            if(arr[i]<min)
                min=arr[i];
            if(arr[i]>max)
                max=arr[i];
            sum+=Math.abs(arr[i]);
        }
        if(min>0)
        {
            sum-=2*min;
        }
        if(max<0)
        {
            sum+=2*max;
        }
        pw.println(sum);
        pw.flush();
        pw.close();
    }
}