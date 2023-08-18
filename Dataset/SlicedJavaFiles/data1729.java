public class Main{    public static void main(String[] args) {
        ProblemA a = new ProblemA();
        Scanner in = new Scanner(System.in);
        while(in.hasNextInt()){
            int n = in.nextInt();
            double t = in.nextDouble();
            for (int k=0;k<n;k++){
                houses.add(a.new Point2(in.nextDouble(),in.nextDouble()));
            }
            Collections.sort(houses);
            int ans = 2;
            for (int k=0;k<n-1;k++){
                Point2 cur = houses.get(k);
                Point2 next = houses.get(k+1);
                double dist = (next.x - next.y/2) - (cur.x + cur.y/2);
                if (dist == t) ans ++;
                if (dist > t ) ans+=2;
            }
            System.out.println(ans);
        }
    }
}