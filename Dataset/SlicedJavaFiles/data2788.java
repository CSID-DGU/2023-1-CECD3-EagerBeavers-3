public class Main{    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(reader.readLine());
        while (n-->0){
            String l=reader.readLine();
            String[] a=l.split(" ");
            long A=Long.parseLong(a[0]);
            long B=Long.parseLong(a[1]);
            c=0;
            gcd(A,B);
            System.out.println(c);
        }
    }
}