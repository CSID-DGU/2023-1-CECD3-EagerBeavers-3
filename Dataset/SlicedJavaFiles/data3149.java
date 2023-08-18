public class Main{    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double v = sc.nextDouble();
        double l = sc.nextDouble();
        double d = sc.nextDouble();
        double w = sc.nextDouble();

        double t = 0d;
        if (v <= w) t = time(0, a, v, l);
        else {
            double[] r = acce(0, a, w);
            if (r[1] >= d) t = time(0, a, v, l);
            else {
                t += r[0];
                t += 2d * time(w, a, v, (d - r[1])/2d);
                t += time(w, a, v, l - d);
            }
        }

        System.out.println(t);
    }
}