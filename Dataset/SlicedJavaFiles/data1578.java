public class Main{    public static void main(String[] args) throws Exception {
        Parserdoubt12 s = new Parserdoubt12(System.in);
        
        int n = s.nextInt();
        
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        
        int copy[] = a.clone();
        Arrays.sort(a);
        int count = 0;
        for (int i = 0; i < copy.length; i++) {
            if(a[i] != copy[i]) count++;
        }
        if(count <= 2) System.out.println("YES");
        else System.out.println("NO");
    }
}