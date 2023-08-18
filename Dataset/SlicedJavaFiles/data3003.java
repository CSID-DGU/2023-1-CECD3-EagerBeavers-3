public class Main{    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        if (input.equals("1"))
            System.out.println("NO");
        else {
            if (checkNum(input))
                System.out.println("YES");
            else {
                int i = 2;
                while (i < Integer.parseInt(input)) {
                    if (checkNum(i + "")) {
                        if (Integer.parseInt(input) % i != 0)
                            i++;
                        else
                            break;
                    } else
                        i++;
                }
                if (i == Integer.parseInt(input))
                    System.out.println("NO");
                else
                    System.out.println("YES");
            }
        }
    }
}