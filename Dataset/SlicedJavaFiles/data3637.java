public class Main{    public static void main(String[] args) throws IOException {
        input = new BufferedReader(new FileReader("input.txt")); 
        output = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
        new incendio();
        output.close();
    }
}