public class Main{    public static void main(String args[]) {
        lineCount = scanner.nextInt();
        scanner.nextLine();
        commands = new String[lineCount];

        for (int i = 0; i < lineCount; i++) {
            commands[i] = scanner.nextLine();
        }

        resolveWithDP();
    }
}