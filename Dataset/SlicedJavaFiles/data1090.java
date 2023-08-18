public class Main{    public static void main(String[] args) throws FileNotFoundException {
        ConsoleIO io = new ConsoleIO(new InputStreamReader(System.in), new PrintWriter(System.out));

//        String fileName = "C-large-practice";
//        ConsoleIO io = new ConsoleIO(new FileReader("D:\\Dropbox\\code\\practice\\jb\\src\\" + fileName + ".in"), new PrintWriter(new File("D:\\Dropbox\\code\\practice\\jb\\src\\" + fileName + ".out")));

        new Main(io).solve();
//        new Main(io).solveLocal();

        io.close();
    }
}