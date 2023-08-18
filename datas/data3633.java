public class Main{        public static void main(String[] args) throws IOException {
            Run run = new Run();
            Thread thread = new Thread(run);
            thread.run();
        }
}