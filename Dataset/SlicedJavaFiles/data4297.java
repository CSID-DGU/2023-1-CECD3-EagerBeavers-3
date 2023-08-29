public class Main{    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        
        int n = r.nextInt();
        int k = r.nextInt();
        int A = r.nextInt();
        
        Person[] p = new Person[n];
        
        for(int i = 0; i < n; i++){         
            int l = r.nextInt();
            int prob = r.nextInt();
            
            p[i] = new Person(l, prob);
        }
        
        int[] add = new int[n];
        
        double res = dfs(0, k, p, add, n, A);
        
        System.out.println(res);
        
    }
}