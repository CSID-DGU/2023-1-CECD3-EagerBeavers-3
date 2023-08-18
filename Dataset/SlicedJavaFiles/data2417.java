public class Main{    public static void main(String[] args)throws IOException
    {
        Reader sc=new Reader();
        PrintWriter out=new PrintWriter(System.out);
        int n=sc.i();
        int arr[]=sc.arr(n);
        int count=0;
        for(int i=0;i<n;i++)for(int j=i+1;j<n;j++)if(arr[j]<arr[i])count++;
        count%=2;
        int q=sc.i();
        while(q-->0)
        {
            int a=sc.i();
            int b=sc.i();
            long len=((long)(b-a+1)*(b-a))/2;
            if(len%2==1)count^=1;
            if(count==0)out.println("even");
            else out.println("odd");
        }
        out.flush();
    }
}