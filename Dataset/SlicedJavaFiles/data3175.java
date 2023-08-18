public class Main{    public static void main(String[] args) throws Exception {
         Scanner sc = null;
         PrintWriter pr = null;

         pr=new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
         sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
         //sc = new Scanner(new File("input.txt"));
            
         long n = sc.nextInt();
         if (n > 0) pr.println(n);
         else {
             long n1 = n / 10;
             long n2 = n / 100 * 10  + n % 10;
             if (n1 < n2) pr.println(n2);
             else pr.println(n1);
         }
         
         pr.close();
         sc.close();
    }
}