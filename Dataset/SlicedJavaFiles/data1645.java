public class Main{    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int problemCount = scanner.nextInt();
        int petrCount = scanner.nextInt();
        int vasCount = scanner.nextInt();
        int [] problems = new int[problemCount];
        for (int i = 0; i < problemCount; i++) {
            problems[i] = scanner.nextInt();
            

        }
        Arrays.sort(problems);
        System.out.println(-problems[vasCount - 1] + problems[vasCount]);
    }
}