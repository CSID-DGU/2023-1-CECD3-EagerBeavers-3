public class Main{    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        
        int n = r.nextInt();
        int t = r.nextInt();
        
        House[] a = new House[n];
        for(int i = 0; i < n; i++){
            double c = r.nextInt();
            double l = r.nextInt();
            a[i] = new House(c-l/2, l);
        }
        
        Arrays.sort(a);
        
        int res = 0;
        for(int i = 0; i < n-1; i++){
            double dist = a[i+1].s - (a[i].s+a[i].l);
            
            if(Math.abs(dist - t) < eps)res++;
            else if(dist > t)res += 2;
        }
        
        System.out.println(res+2);
    }
}