public class Main{    public static void main(String[] args) throws Exception {
        int n = nextInt(), b = nextInt(), a = nextInt();
        
        int[] mas = new int[n];
        for(int i = 0; i<n; i++) {
            mas[i] = nextInt();
        }
        Arrays.sort(mas);
        
        if(mas[a - 1] == mas[a]) {
            exit(0);
        }
        
        println(mas[a] - mas[a-1]);
    }
}