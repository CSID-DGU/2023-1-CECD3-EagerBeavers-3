public class Main{	public static void main(String[] args) throws IOException {
		File inputFile = new File("entradaC");
		if (inputFile.exists())
			System.setIn(new FileInputStream(inputFile));
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder out = new StringBuilder();
		String line = "";
		while ((line = in.readLine()) != null) {
			int n = Integer.parseInt(line);
			char[] p = in.readLine().toCharArray();
			HashMap<Character, Integer> dif = new HashMap<>();
			for (int i = 0; i < p.length; i++)
				dif.put(p[i], 0);
			int ndif = dif.size();
			int head = 0, tail = 0, cnt = 0, ans = Integer.MAX_VALUE, cur;
			while (head < n) {
				cur = dif.get(p[head]);
				if (cur == 0)
					cnt++;
				dif.put(p[head], cur + 1);
				head++;
				if (cnt == ndif)
					ans = Math.min(ans, head - tail);
				while (tail < head && cnt == ndif) {
					cur = dif.get(p[tail]);
					if (cur == 1)
						cnt--;
					dif.put(p[tail], cur - 1);
					tail++;
					if (cnt == ndif)
						ans = Math.min(ans, head - tail);
				}
			}
			if (ndif == 1)
				ans = 1;
			out.append(ans + "\n");

		}
		System.out.print(out);
	}
}