public class Main{	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter printer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		nV = Integer.parseInt(reader.readLine());

		chldn = new ArrayList[nV];
		for (int i = 0; i < nV; i++) {
			chldn[i] = new ArrayList<>();
		}

		anc = new int[nV][21];
		depth = new int[nV];

		num = new int[nV];
		nLoc = new int[nV];
		tree = new int[nV * 4][2];
		for (int[] a : tree) {
			a[0] = a[1] = -1;
		}

		root = 0;

		StringTokenizer inputData = new StringTokenizer(reader.readLine());
		for (int i = 0; i < nV; i++) {
			num[i] = Integer.parseInt(inputData.nextToken());
			nLoc[num[i]] = i;
		}

		inputData = new StringTokenizer(reader.readLine());
		for (int i = 1; i < nV; i++) {
			anc[i][0] = Integer.parseInt(inputData.nextToken()) - 1;
			chldn[anc[i][0]].add(i);
		}

		preprocess();

		build(1, 0, nV - 1);

		int nQ = Integer.parseInt(reader.readLine());

		while (nQ-- > 0) {
			inputData = new StringTokenizer(reader.readLine());
			if (inputData.nextToken().equals("1")) {
				int a = Integer.parseInt(inputData.nextToken()) - 1;
				int b = Integer.parseInt(inputData.nextToken()) - 1;

				int temp = num[a];
				num[a] = num[b];
				num[b] = temp;

				nLoc[num[a]] = a;
				nLoc[num[b]] = b;

				update(1, 0, nV - 1, num[a]);
				update(1, 0, nV - 1, num[b]);
			} else {
				printer.println(query(1, 0, nV - 1, nLoc[0], nLoc[0]) + 1);
			}
		}
		printer.close();
	}
}