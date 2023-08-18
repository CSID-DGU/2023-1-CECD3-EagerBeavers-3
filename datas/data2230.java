public class Main{	public static void main(String[] argv) {
		cf908G pro = new cf908G();
		
		InputStream fin = null;
		if (System.getProperty("ONLINE_JUDGE") == null) {
			try {
				fin = new FileInputStream("input.txt");
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		} else {
			fin = System.in;
		}
		pro.solve(new Scanner(fin), System.out);
	}
}