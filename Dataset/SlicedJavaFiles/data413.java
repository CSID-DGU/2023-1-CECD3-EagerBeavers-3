public class Main{	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();

		int[] numbers = new int[n];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = sc.nextInt();
		}

		HashSet<Integer> hs = new HashSet<Integer>();
		for (int i = 0; i < numbers.length; i++) {
			hs.add(numbers[i]);
		}

		int[] belongs = new int[n];
		for (int i = 0; i < belongs.length; i++) {
			belongs[i] = -1;
		}

		HashMap<Integer, Integer> numberToIndex = new HashMap<Integer, Integer>();
		for (int i = 0; i < numbers.length; i++) {
			numberToIndex.put(numbers[i], i);
		}

		boolean possible = true;

		List<List<Integer>> layers = getLayers(numbers, a, b);
		for (List<Integer> layer : layers) {

			if (layer.size() == 0) {
				System.out.println("NO");
				return;
			}

			int starting = -1;
			for (int j = 0; j < layer.size(); j++) {
				int cur = layer.get(j);

				int nei = 0;
				if (hs.contains(a - cur)) {
					nei++;
				}

				if (hs.contains(b - cur)) {
					nei++;
				}

				if (nei == 1 || (a == b && nei == 2)) {
					starting = j;
				}
			}

			if (starting == -1)
				throw new Error();

			int c = layer.get(starting);
			HashSet<Integer> layerset = new HashSet<Integer>(layer);
			while (true) {

				if (layerset.contains(c) && layerset.contains(a - c)) {
					belongs[numberToIndex.get(c)] = 0;
					belongs[numberToIndex.get(a - c)] = 0;
					layerset.remove(c);
					layerset.remove(a - c);
					c = b - (a - c);
				} else if (layerset.contains(c) && layerset.contains(b - c)) {
					belongs[numberToIndex.get(c)] = 1;
					belongs[numberToIndex.get(b - c)] = 1;
					layerset.remove(c);
					layerset.remove(b - c);
					c = a - (b - c);
				} else {
					break;
				}

			}
		}

		printResult(belongs);

	}
}