public class Main{    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        String code = "";
        

    for (int i = 0; i < n; i++) {
        long chResult = 0;
        long chResult1 = 0;
        long nResult = 0;
        long nResult1 = 0;
        boolean t = false;
        boolean k = false;
        code = sc.nextLine();

        for (int j = 0; j < code.length(); j++) {
            char c = code.charAt(j);
            if (('Z' - c) < 33) {
                if (t) {
                    chResult1 = chResult;
                    chResult = 0;
                    t = false;
                    k = true;
                }
                chResult = chResult * 26 + (26 - ('Z' - c));
            } else {
                t = true;
                if (k) {
                    nResult1 = nResult;
                    nResult = 0;
                    k = false;
                }
                nResult = nResult * 10 + (9 - ('9' - c));
            }

        }

        if (chResult1 == 0) {
            System.out.println("R" + nResult + "C" + chResult);
        } else {
            System.out.println(convert(nResult) + nResult1);
        }

    }

    }
}