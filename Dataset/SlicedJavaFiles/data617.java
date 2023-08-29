public class Main{    public static void main(String[] z) throws Exception {
        PrintWriter pw = new PrintWriter(System.out);
        Scanner s = new Scanner(System.in);
        int a = ni(), b=ni(), o=2;
        m = new int[a];
        for(int q=0; q<a; q++) m[q] = ni();
        Arrays.sort(m);
        for(int q=1; q<a; q++){
            if(m[q]-m[q-1]==b*2) o++;
            else if(m[q]-m[q-1]>b*2) o+=2;
        }
        System.out.println(o);
        pw.flush();
    }
}