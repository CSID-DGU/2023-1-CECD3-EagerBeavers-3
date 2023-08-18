public class Main{    public static void main(String args[] ) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    	String s[] = in.readLine().split(" ");
    	long n = Long.parseLong(s[0]);
    	long k = Long.parseLong(s[1]);
    	long x = bs(n,k);
    	out.println(n-x+1);
        out.close();
    }
}