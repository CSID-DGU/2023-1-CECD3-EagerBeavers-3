public class Main{    public static void main(String[] args) throws FileNotFoundException {
        // PrintWriter out = new PrintWriter(new FileOutputStream(new File(
        // "output.txt")));

        Scanner in = new Scanner();
        int n = in.nextInt();
        int minX = -1;
        int start = 1;
        int end = n;
        c = 0;
        while (start <= end) {
            int mid = (start + end) >> 1;
            c = increaseC(c);
            System.out.println("? " + mid + " 1 " + n + " " + n);
            System.out.flush();

            int v = in.nextInt();
            if (v == 2) {
                minX = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        //System.out.println("Minx " + minX);
        int maxX = -1;
        start = minX;
        end = n;
        while (start <= end) {
            int mid = (start + end) >> 1;
            c = increaseC(c);
            System.out.println("? " + minX + " 1 " + mid + " " + n);
            System.out.flush();
            int v = in.nextInt();
            if (v == 2) {
                maxX = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        // System.out.println("Maxx " + maxX);
        int minY = -1;
        start = 1;
        end = n;
        while (start <= end) {
            int mid = (start + end) >> 1;
            c = increaseC(c);
            System.out.println("? " + minX + " " + mid + " " + maxX + " " + n);
            System.out.flush();

            int v = in.nextInt();
            if (v == 2) {
                minY = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        // System.out.println("MinY " + minY);
        int maxY = -1;
        start = minY;
        end = n;
        while (start <= end) {
            int mid = (start + end) >> 1;
            c = increaseC(c);
            System.out.println("? " + minX + " " + minY + " " + maxX + " " + mid);
            System.out.flush();

            int v = in.nextInt();
            if (v == 2) {
                maxY = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        // System.out.println("MaxY " + maxY);
        int middleMinX = maxX;
        start = minX;
        end = maxX;
        while (start <= end) {
            int mid = (start + end) >> 1;
            c = increaseC(c);
            System.out.println("? " + minX + " " + minY + " " + mid + " " + maxY);
            System.out.flush();

            int v = in.nextInt();
            if (v == 1) {
                middleMinX = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        //System.out.println("MiddleMinX " + middleMinX);
        int middleMaxX = -1;
        start = middleMinX + 1;
        end = maxX;
        while (start <= end) {
            int mid = (start + end) >> 1;
            c = increaseC(c);
            System.out.println("? " + mid + " " + minY + " " + maxX + " " + maxY);
            System.out.flush();

            int v = in.nextInt();
            if (v == 1) {
                middleMaxX = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        // System.out.println("MiddleMaxX " + middleMaxX);
        if (middleMaxX == -1) {
            int middleMinY = -1;
            start = minY;
            end = maxY;
            while (start <= end) {
                int mid = (start + end) >> 1;
                c = increaseC(c);
                System.out.println("? " + minX + " " + minY + " " + maxX + " " + mid);
                System.out.flush();

                int v = in.nextInt();
                if (v == 1) {
                    middleMinY = mid;
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            //System.out.println("MiddleMinY " + middleMinY);
            int middleMaxY = -1;
            start = middleMinY + 1;
            end = maxY;
            while (start <= end) {
                int mid = (start + end) >> 1;
                c = increaseC(c);
                System.out.println("? " + minX + " " + mid + " " + maxX + " " + maxY);
                System.out.flush();

                int v = in.nextInt();
                if (v == 1) {
                    middleMaxY = mid;
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            //System.out.println("MiddleMaxY " + middleMaxY);
            if (minX == maxX) {
                System.out.println("! " + minX + " " + minY + " " + maxX + " " + middleMinY + " " + minX + " " + middleMaxY + " " + maxX + " " + maxY);
                System.out.flush();
            } else {
                int[] a = calX(minX, maxX, minY, middleMinY, in);
                int[] b = calX(minX, maxX, middleMaxY, maxY, in);
                check(a);
                check(b);
                System.out.println("! " + a[0] + " " + minY + " " + a[1] + " " + middleMinY + " " + b[0] + " " + middleMaxY + " " + b[1] + " " + maxY);
                System.out.flush();
            }
        } else if (minY == maxY) {
            System.out.println("! " + minX + " " + minY + " " + middleMinX + " " + maxY + " " + middleMaxX + " " + minY + " " + maxX + " " + maxY);
            System.out.flush();
        } else {
            int[] a = calY(minX, middleMinX, minY, maxY, in);
            int[] b = calY(middleMaxX, maxX, minY, maxY, in);
            check(a);
            check(b);
            System.out.println("! " + minX + " " + a[0] + " " + middleMinX + " " + a[1] + " " + middleMaxX + " " + b[0] + " " + maxX + " " + b[1]);
            System.out.flush();
        }

    }
}