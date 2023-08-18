public class Main{    public static void main(String[] args) throws Exception {
        int n = nextInt();
        
        int[] mas = new int[n];
        
        for(int i = 0; i<n; i++) {
            mas[i] = nextInt();
        }
        
        Arrays.sort(mas);
        
        if(mas[n-1] == 1) {
            for(int i = 0; i<n-1; i++) {
                out.print(1 + " ");
            }
            out.println(2);
            out.flush();
            exit();
        }
        
        out.print("1 ");
        
        for(int i = 0; i<n-1; i++) {
            out.print(mas[i] + " ");
        }
        
        out.println();
        out.flush();
    }
}