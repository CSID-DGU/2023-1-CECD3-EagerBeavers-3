public class Main{	public static void main(String[] args) {
		try (BufferedReader r = new BufferedReader(new InputStreamReader(System.in))) {
			final int N = Integer.parseInt(r.readLine());
			Matrix m1 = readMatrix(r, N), m2 = readMatrix(r, N);
			boolean matched = matchesFlipped(m1, m2);
			int i = 0;
			while (i < 3 && !matched) {
				m1 = new MRot(m1);
				matched = matchesFlipped(m1, m2);
				i++;
			}
			System.out.println(matched ? "Yes" : "No");
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}