public class Main{    public static void main(String[] args) throws IOException
    {
        Reader z = new Reader();
        long n=z.nextLong(), k=z.nextLong(), x;
        x=9L+8L*(k+n);
        x=(long) Math.sqrt(x);
        x=(x-3)/2;
        System.out.println(n-x);
    }
}