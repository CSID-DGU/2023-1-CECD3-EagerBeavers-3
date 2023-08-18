public class Main{    public static void main(String[] args) {
        Main iq = new Main();
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int[] naturalNumbers = new int[n];
        for (int i = 0; i < naturalNumbers.length; i++) {
            naturalNumbers[i] = sc.nextInt();
        }
        System.out.println(iq.diffInEvenness(n, naturalNumbers));          
    }
}