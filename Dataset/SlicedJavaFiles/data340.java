public class Main{    public static void main(String[] args) throws IOException {

        in = new StreamTokenizer(new InputStreamReader (System.in) );
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintStream(System.out);

        readLine();
        String s = readLine();
        int n = s.length();
        String kk = s;
        int ans = n*100;
        for (int tr=0; tr<n+2; tr++) {
        	String kk2 = "";
        	for (int i=1; i<n; i++) kk2 = kk2 +kk.charAt(i);
        	kk2 = kk2 + kk.charAt(0);
        	kk = kk2;
        
        int cur = genans(kk);
        //out.println(kk+" "+cur);
        if (cur<ans) ans = cur;
        }
        
        out.println(ans);

    }
}