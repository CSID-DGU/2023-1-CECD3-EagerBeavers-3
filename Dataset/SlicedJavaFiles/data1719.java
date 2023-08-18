public class Main{    public static void main(String[] args) {
        Scanner inScanner = new Scanner(System.in);
        int n = inScanner.nextInt();
        int t = inScanner.nextInt();
        House[] houses = new House[n];
        for (int i = 0; i < n; i++)
            houses[i] = new House(inScanner.nextInt(), inScanner.nextInt());
        Arrays.sort(houses);
        int sum = 2;
        for (int i = 1; i < n; i++) {
            double space = houses[i].leftX - houses[i - 1].rightX;
            if (space >= t)
                sum++;
            if (space > t)
                sum++;
        }
        System.out.println(sum);
    }
}