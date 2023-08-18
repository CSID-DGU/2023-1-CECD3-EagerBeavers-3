public class Main{	public static void main(String...strings) throws Exception {
		String[] specs = reader.readLine().split(" ");
		
		int x = Integer.parseInt(specs[0]);
		int y = Integer.parseInt(specs[1]);
		int z = Integer.parseInt(specs[2]);
		int t1 = Integer.parseInt(specs[3]);
		int t2 = Integer.parseInt(specs[4]);
		int t3 = Integer.parseInt(specs[5]);
		
		reader.close();
		String ans = solve(x, y, z, t1, t2, t3);
		writer.append(ans);
		writer.flush();
		writer.close();
	}
}