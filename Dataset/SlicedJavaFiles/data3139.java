public class Main{    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double maxV = scanner.nextDouble();
        double l = scanner.nextDouble();
        double d = scanner.nextDouble();
        double w = scanner.nextDouble();

        double r = l - d;
        w = Math.min(w, maxV);

        List<WayPoint> wayPoints = new ArrayList<WayPoint>(256);
        double t = 0;

        wayPoints.add(new WayPoint(0));

        double dW = dTo(w, 0, a);
        if (leq(dW, d)) {
            wayPoints.add(new WayPoint(w));
            {
                double v = v(w, a, (d - dW) / 2);
                v = Math.min(v, maxV);

                wayPoints.add(new WayPoint(v));
                wayPoints.add(new WayPoint(w));

                double dW_V = dTo(v, w, a);
                double vDistance = d - dW - 2 * dW_V;
                if (!eq(vDistance)) {
                    t += vDistance / maxV;
                }
            }
            {
                double dW_MaxV = dTo(maxV, w, a);
                dW_MaxV = Math.min(dW_MaxV, r);
                double v = v(w, a, dW_MaxV);
                wayPoints.add(new WayPoint(v));
                double dMaxV = r - dW_MaxV;
                if (!eq(dMaxV)) {
                    t += dMaxV / maxV;
                }
            }

        } else {
            double dMaxV = dTo(maxV, 0, a);
            dMaxV = Math.min(dMaxV, l);
            double v = v(0, a, dMaxV);
            wayPoints.add(new WayPoint(v));
            double dv = l - dMaxV;
            if (!eq(dMaxV)) {
                t += dv / maxV;
            }
        }

        for (int i = 1; i < wayPoints.size(); ++i) {
            double v0 = wayPoints.get(i - 1).v;
            double v = wayPoints.get(i).v;
            t += Math.abs(tTo(v, v0, a));
        }
        System.out.println(t);
    }
}