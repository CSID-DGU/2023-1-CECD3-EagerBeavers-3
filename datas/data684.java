public class Main{    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        in.nextLine();
        for (int i = 0; i < N; i++) {
            String str = in.nextLine();
            if (str.indexOf("R") == 0 && str.indexOf("R") + 1 < str.indexOf("C") && isNum(str.charAt(1))) {
                int row = Integer.parseInt(str.substring(str.indexOf("R") + 1, str.indexOf("C")));
                int col = Integer.parseInt(str.substring(str.indexOf("C") + 1));
                System.out.println(convertRC(row, col));
            } else {
                String row = "";
                int j = 0;
                while (str.charAt(j) >= 'A' && str.charAt(j) <= 'Z') {
                    row += str.charAt(j);
                    j++;
                }
                int num = Integer.parseInt(str.substring(j));
                System.out.println(convertAB(row, num));
            }
        }
    }
}