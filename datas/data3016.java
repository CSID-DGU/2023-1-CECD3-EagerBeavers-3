public class Main{    public static void main(String[] args) throws Exception {
        in = new Scanner(System.in);
//		in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
//		in = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);

        int n = next();

        if (n%4 == 0||n%7 == 0||n%44 == 0||n%47 == 0||n%74 == 0||n%77 == 0||n%444 == 0||n%447 == 0||n%474 == 0||n%744 == 0||n%774 == 0||n%747 == 0||n%477 == 0||n%777==0) out.println("YES");
        else out.println("NO");

        out.println();
        out.close();
    }
}