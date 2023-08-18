public class Main{    public static void main(String[] args) {
        MSpreadSheet sh = new MSpreadSheet();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 0;
        while(i<n)
        {
            sh.solve(s.next());
            i++;
        }
    }
}