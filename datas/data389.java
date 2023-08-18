public class Main{	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder qq = new StringBuilder();
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		String y[] = in.readLine().split(" ");
		int n = Integer.parseInt(y[0]);
		int a = Integer.parseInt(y[1]);
		int b = Integer.parseInt(y[2]);

		int arr[] = new int[n];
		HashMap<Integer, Integer> mp = new HashMap();
		y = in.readLine().split(" ");
		boolean flag = true;
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(y[i]);
			if (arr[i] >= a && arr[i] >= b) {
				flag = false;
			}
			mp.put(arr[i], i);
		}

		if (!flag) {
			System.out.println("NO");
			return;
		}
		boolean ch[] = new boolean[n];
		int ans[] = new int[n];

		for (int i = 0; i < n; i++) {
			int k = i;

			while (true&&!ch[k]) {
				
				if (mp.containsKey(a - arr[k]) && !ch[mp.get(a - arr[k])]
						&& mp.containsKey(b - arr[k])
						&& !ch[mp.get(b - arr[k])]) {
					break;
				} else if (mp.containsKey(a - arr[k])
						&& !ch[mp.get(a - arr[k])]) {
					//System.out.println(arr[k]);
					ch[k] = true;
					ans[k] = 0;
					ch[mp.get(a - arr[k])] = true;
					ans[mp.get(a - arr[k])] = 0;
					int s = b - (a - arr[k]);
					if (mp.containsKey(s)) {
						k = mp.get(s);
					} else
						break;
					
				} else if (mp.containsKey(b - arr[k])
						&& !ch[mp.get(b - arr[k])]) {
					ans[k] = 1;
					ans[mp.get(b - arr[k])] = 1;
					ch[k] = true;
					ch[mp.get(b - arr[k])] = true;

					int s = a - (b - arr[k]);
					if (mp.containsKey(s)) {
						k = mp.get(s);
					} else
						break;
				} else {
					// System.out.println(arr[i] + " " + i);
					System.out.println("NO");
					return;
				}
			}
		}

		qq.append("YES\n");
		for (int i = 0; i < ans.length; i++) {
			qq.append(ans[i] + " ");
		}
		System.out.println(qq);

	}
}