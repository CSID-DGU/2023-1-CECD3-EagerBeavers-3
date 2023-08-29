public class Main{    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] ss = br.readLine().split(" +");
        long a = Long.parseLong(ss[0]);
        long b = Long.parseLong(ss[1]);
        
        System.out.println(func(a, b));
        
    }
}