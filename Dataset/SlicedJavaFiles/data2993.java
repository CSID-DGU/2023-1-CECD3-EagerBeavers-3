public class Main{    public static void main(String[] args) {
        Reader read = new Reader();

        int n = read.nextInt();
        int a1 = read.nextInt();
        int a2 = read.nextInt();
        int b1 = read.nextInt();
        int b2 = read.nextInt();
        int c1 = read.nextInt();
        int c2 = read.nextInt();

        if (b1 > a1 && b2 > a2 && c1 > a1 && c2 > a2)
            System.out.print("YES");
        else if (b1 > a1 && b2 < a2 && c1 > a1 && c2 < a2)
            System.out.print("YES");
        else if (b1 < a1 && b2 > a2 && c1 < a1 && c2 > a2)
            System.out.print("YES");
        else if (b1 < a1 && b2 < a2 && c1 < a1 && c2 < a2)
            System.out.print("YES");
        else
            System.out.print("NO");
    }
}