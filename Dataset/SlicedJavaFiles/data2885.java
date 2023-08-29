public class Main{    public static void main(String[] args) throws IOException {
        //BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc=new Scanner (System.in);
    //  StringTokenizer st=new StringTokenizer(buf.readLine());
        int n=sc.nextInt();
        System.out.println(n%2==0?4+" "+(n-4):9+" "+(n-9));

    }
}