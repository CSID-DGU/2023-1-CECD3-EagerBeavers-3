

import java.util.*;
import java.io.*;
import java.math.*;
import javafx.util.Pair;
public class Main
{
    static class FastReader
    {
        private InputStream mIs;private byte[] buf = new byte[1024];private int curChar,numChars;public FastReader() { this(System.in); }public FastReader(InputStream is) { mIs = is;}

    }
    public static void main(String[] args)throws IOException {
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
        if(n==2)
        {
            pw.println(arr[0]);
            pw.flush();
            pw.close();
            return;
        }
        if(n==3)
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
        for(int i=0;i<n;++i)
        {
            if(arr[i]<min)
                min=arr[i];
            if(arr[i]>max)
                max=arr[i];
            sum+=Math.abs(arr[i]);
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
            sum-=2*min;
        }
        if(max<0)
        {
            sum+=2*max;
            sum+=2*max;
        }
        pw.println(sum);
        pw.flush();
        pw.close();
    }
}