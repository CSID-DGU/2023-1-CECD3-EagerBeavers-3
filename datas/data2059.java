public class Main{	public static void main(String[] args) throws IOException {
		boolean oj = System.getProperty("ONLINE_JUDGE") != null;
		Reader reader;
		reader=oj ? new InputStreamReader(System.in) : new FileReader("input.txt");
		input=new BufferedReader(reader);
		Writer writer=new OutputStreamWriter(System.out);
		writer=new BufferedWriter(writer);
		output=new PrintWriter(writer);
		new TaskA().Run();
		output.close();
	}
}