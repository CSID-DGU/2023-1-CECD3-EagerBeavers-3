public class Main{    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        s.nextLine();
        while(s.hasNext()) {
            int first = s.nextInt();
            int second = s.nextInt();
            System.out.println(calculate(first,second));
        }
    }
}